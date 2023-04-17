package com.example.aicreations.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

private const val FIRST_CREATION = 0
private const val TAG = "UICategoryScreen"

@Composable
fun CategoryList(
    uiState: AiCreationsUiState,
    uiLayout: UiLayout,
    onCategoryTab: ((Creation) -> Unit),
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .padding(12.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start


    ) {
        items(uiState.creations.keys.toList()) {
            val currentCreation = uiState.creations[it]!!.getOrNull(index = FIRST_CREATION)
            val selectedCreation = uiState.currentCreation
            CategoryListItem(
                creation = currentCreation!!,
                isSelected = currentCreation.categoryId==selectedCreation.categoryId,
                uiLayout = uiLayout,
                onCategoryTab = onCategoryTab,
            )
        }
    }

}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CategoryListItem(
    creation: Creation,
    onCategoryTab: ((Creation) -> Unit),
    uiLayout: UiLayout,
    isSelected: Boolean = false,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(bottom = 5.dp)
            .fillMaxWidth()
            .height(100.dp),

        elevation = 3.dp,
        onClick = {
            onCategoryTab(creation)
            //TODO remove:
            //Log.d(TAG,"onClick passed on ID:"+creation.categoryId)
        },
        backgroundColor = when(isSelected) {
            true -> Color.Gray
            false -> Color.White
        }
    ) {
        Box(
            modifier = Modifier
        ) {
            Image(
                painter = painterResource(id = creation.imageId),
                contentDescription = stringResource(id = creation.descriptionId),
                Modifier.fillMaxWidth(), contentScale = ContentScale.FillWidth,
                colorFilter = when(!isSelected) {
                    true -> when(uiLayout==UiLayout.COMPACT) {
                        true -> null
                        else -> ColorFilter.tint(color = Color.Gray, blendMode = BlendMode.Color)
                    }
                    else -> null
                }
            )
            Text(
                text = stringResource(id = creation.categoryId),
                modifier = Modifier.padding(start = 8.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOfCategoryList() {
    val viewModel: AiCreationsViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    CategoryList(
        uiState = uiState,
        uiLayout = UiLayout.COMPACT,
        onCategoryTab = {}
    )
}