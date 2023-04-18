package com.example.aicreations.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.aicreations.model.Creation
import com.example.aicreations.ui.utils.UiLayout

@Composable
fun CreationList(
    uiState: AiCreationsUiState,
    uiLayout: UiLayout,
    onCreationClicked: (Creation) -> Unit,
    modifier: Modifier = Modifier,
    amountOfCells: Int = 2,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(amountOfCells),
        verticalArrangement = Arrangement.spacedBy(6.dp),
        horizontalArrangement = Arrangement.spacedBy(2.dp),
        modifier = modifier
            .wrapContentSize()
            .scale(1f)


    ) {
        val currentCreationCategory = uiState.currentCategory
        val currentCreations = uiState.creations[currentCreationCategory]!!
        val selectedCreation = uiState.currentCreation
        items(currentCreations) { creation ->
            CreationListItem(
                creation = creation,
                onCreationClicked = onCreationClicked,
                uiLayout = uiLayout,
                isSelected = selectedCreation == creation,
                modifier = modifier
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CreationListItem(
    creation: Creation,
    onCreationClicked: (Creation) -> Unit,
    uiLayout: UiLayout,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false

) {
    Card(
        modifier = modifier,
        onClick = { onCreationClicked(creation) }

    ) {
        Image(
            painter = painterResource(id = creation.imageId),
            contentDescription = stringResource(id = creation.descriptionId),
            modifier = Modifier,
            colorFilter = when(!isSelected) {
                true -> when(uiLayout== UiLayout.COMPACT) {
                    true -> null
                    else -> ColorFilter.tint(color = Color.Gray, blendMode = BlendMode.Color)

                }
                false-> null
            },
            contentScale = ContentScale.Fit
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOfCreationList() {
    val viewModel: AiCreationsViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    CreationList(
        uiState = uiState,
        uiLayout = UiLayout.COMPACT,
        onCreationClicked = {}
    )
}