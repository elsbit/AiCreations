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
fun ContentList(
    uiState: AiCreationsUiState,
    amountOfCells: Int = 2,
    uiLayout: UiLayout,
    onCreationClicked: (Creation) -> Unit,
    modifier: Modifier = Modifier
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
        val currentCreations = uiState.creations.get(currentCreationCategory)!!
        val selectedCreation = uiState.currentCreation
        items(currentCreations) { creation ->
            ContentListItem(
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
fun ContentListItem(
    creation: Creation,
    onCreationClicked: (Creation) -> Unit,
    uiLayout: UiLayout,
    isSelected: Boolean = false,
    modifier: Modifier = Modifier
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
fun PreviewOfContentList() {
    val viewModel: AiCreationsViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    ContentList(
        uiState = uiState,
        uiLayout = UiLayout.COMPACT,
        onCreationClicked = {}
    )
}