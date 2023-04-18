package com.example.aicreations.ui

import android.util.Log
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Scaffold
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.aicreations.R
import com.example.aicreations.model.Creation
import com.example.aicreations.ui.utils.UiLayout

enum class AiCreationUiScreen(@StringRes val title: Int) {
    Category(title =  R.string.app_topbar_title_category),
    Creations(title = R.string.app_topbar_title_creations),
    Details(title = R.string.app_topbar_title_details)
}

private const val  TAG = "UI"

@Composable
fun AiCreationsUi(
    windowWidth: WindowWidthSizeClass,
    modifier: Modifier = Modifier,
    viewModel: AiCreationsViewModel = viewModel(),
    navController: NavHostController = rememberNavController(),
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val uiState by viewModel.uiState.collectAsState()
    val currentScreen = AiCreationUiScreen.valueOf(
        backStackEntry?.destination?.route ?: AiCreationUiScreen.Category.name
    )

    //Device orientation implementation
    val uiLayout: UiLayout = when(windowWidth) {
        WindowWidthSizeClass.Compact -> UiLayout.COMPACT
        WindowWidthSizeClass.Medium -> UiLayout.MEDIUM
        WindowWidthSizeClass.Expanded -> UiLayout.EXPANDED
        else -> UiLayout.COMPACT
    }

    // update current Category; only used in expanded and medium layout
    val onCategoryTab:(Creation) -> Unit  = {creation ->
        Log.d(TAG,"Tab pressed: ID: "+creation.categoryId)
        viewModel.updateCurrentCreation(creation)
    }

    // TODO onCreationClicked -> show details of Creations
    val onCreationClicked:(Creation) -> Unit = {creation ->
        Log.d(TAG,"Creation pressed: ID: "+creation.imageId)
        viewModel.updateCurrentCreation(creation)
    }

    Scaffold(
        topBar = {
            AiCreationsUiTopBar(
                onBackButtonClicked = { navController.navigateUp() },
                uiLayout = uiLayout,
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null
            )
        }
    ) { innerPadding ->
        when(uiLayout) {
            //MEDIUM ORIENTATION
            UiLayout.MEDIUM -> {
                Row(
                    modifier = Modifier.fillMaxSize()

                ) {
                    CategoryList(
                        uiState = uiState,
                        onCategoryTab = onCategoryTab,
                        uiLayout = uiLayout,
                        modifier = Modifier
                            //.width(200.dp)
                            .weight(0.2f)
                    )
                    CreationList(
                        uiState = uiState,
                        uiLayout = uiLayout,
                        amountOfCells = 1,
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
            //EXPANDED ORIENTATION
            UiLayout.EXPANDED -> {
                Row(
                    modifier = Modifier.fillMaxSize()

                ) {
                    CategoryList(
                        uiState = uiState,
                        uiLayout = uiLayout,
                        onCategoryTab = onCategoryTab,
                        modifier = Modifier.width(200.dp)
                    )
                    CreationList(
                        uiState = uiState,
                        uiLayout = uiLayout,
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
            //COMPACT ORIENTATION
            else -> {
                NavHost(
                    navController = navController,
                    startDestination = AiCreationUiScreen.Category.name,
                    modifier = modifier.padding(innerPadding)
                ) {
                    composable(
                        route = AiCreationUiScreen.Category.name
                    ) {
                        CategoryList(
                            uiState = uiState,
                            onCategoryTab = {creation ->
                                Log.d(TAG,"Tab pressed: ID: "+creation.categoryId)
                                viewModel.updateCurrentCreation(creation)
                                navController.navigate(AiCreationUiScreen.Creations.name)
                            },
                            uiLayout = uiLayout,
                            modifier = Modifier.padding(innerPadding))
                    }
                    composable(route = AiCreationUiScreen.Creations.name) {
                        CreationList(
                            uiState = uiState,
                            uiLayout = uiLayout,
                            onCreationClicked = { creation ->
                                Log.d(TAG,"Tab pressed: ID: "+creation.categoryId)
                                viewModel.updateCurrentCreation(creation)
                                navController.navigate(AiCreationUiScreen.Details.name)
                            } )
                    }
                    composable(route = AiCreationUiScreen.Details.name) {
                        DetailScreen(
                            uiState = uiState
                        )
                    }
                }
            }
        }
    }
}

