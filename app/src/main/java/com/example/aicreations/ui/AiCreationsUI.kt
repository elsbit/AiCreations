package com.example.aicreations.ui

import android.util.Log
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Scaffold
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.aicreations.model.Creation
import com.example.aicreations.ui.utils.UiLayout

private const val  TAG = "UI"

@Composable
fun AiCreationsUi(windowWidth: WindowWidthSizeClass) {

    //ViewModel implementation
    val viewModel: AiCreationsViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    //Device orientation implementation
    val componentLayout: UiLayout = when(windowWidth) {
        WindowWidthSizeClass.Compact -> UiLayout.COMPACT
        WindowWidthSizeClass.Medium -> UiLayout.MEDIUM
        WindowWidthSizeClass.Expanded -> UiLayout.EXPANDED
        else -> UiLayout.COMPACT
    }

    // update current Category
    val onCategoryTab:(Creation) -> Unit  = {creation ->
        Log.d(TAG,"Tab pressed: ID: "+creation.categoryId)
        viewModel.updateCurrentCreation(creation)
    }

    // TODO onBackButtonClicked -> navigate back or close

    // TODO onCreationClicked -> show details of Creations
    val onCreationClicked:(Creation) -> Unit = {creation ->
        Log.d(TAG,"Creation pressed: ID: "+creation.imageId)
        viewModel.updateCurrentCreation(creation)
    }

    Scaffold(
        topBar = {
            AiCreationsUiTopBar(
                creation = uiState.currentCreation,
                onBackButtonClicked = { /*TODO*/ },
                componentLayout = componentLayout
            )
        }
    ) {
        when(componentLayout) {
            //COMPACT ORIENTATION
            UiLayout.COMPACT -> {
                CategoryList(
                    uiState = uiState,
                    onCategoryTab = onCategoryTab,
                    modifier = Modifier.padding(it))
            }
            //MEDIUM ORIENTATION
            UiLayout.MEDIUM -> {

            }
            //EXPANDED ORIENTATION
            UiLayout.EXPANDED -> {
                Row(
                    modifier = Modifier.fillMaxSize()

                ) {
                    CategoryList(
                        uiState = uiState,
                        onCategoryTab = onCategoryTab,
                        modifier = Modifier.width(200.dp)
                    )
                    ContentList(
                        uiState = uiState,
                        onCreationClicked = onCreationClicked,
                        modifier = Modifier
                            .weight(0.3f)
                            //.width(400.dp)
                    )
                    DetailScreen(
                        uiState = uiState,
                        modifier = Modifier
                            .weight(0.5f)
                    )
                }
            }

            else -> {
                CategoryList(
                    uiState = uiState,
                    onCategoryTab = onCategoryTab,
                    modifier = Modifier.padding(it))
            }
        }
    }
}

