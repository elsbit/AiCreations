package com.example.aicreations.ui

import android.util.Log
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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

enum class AiCreationUiScreen(@StringRes val title: Int, @StringRes val info: Int) {
    Category(
        title =  R.string.app_topbar_title_compact_category,
        info = R.string.app_topbar_information_category
    ),
    Creations(
        title = R.string.app_topbar_title_compact_creations,
        info = R.string.app_topbar_information_creations
    ),
    Details(
        title = R.string.app_topbar_title_compact_details,
        info = R.string.app_topbar_information_details
    )
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

    //Device orientation
    val uiLayout: UiLayout = when(windowWidth) {
        WindowWidthSizeClass.Compact -> UiLayout.COMPACT
        WindowWidthSizeClass.Medium -> UiLayout.MEDIUM
        WindowWidthSizeClass.Expanded -> UiLayout.EXPANDED
        else -> UiLayout.COMPACT
    }

    val onCategoryClicked:(Creation) -> Unit  = { creation ->
        Log.d(TAG,"Tab pressed: ID: "+creation.categoryId)
        viewModel.updateCurrentCreation(creation)
    }

    val onCreationClicked:(Creation) -> Unit = {creation ->
        Log.d(TAG,"Creation pressed: ID: "+creation.imageId)
        viewModel.updateCurrentCreation(creation)
    }

    Column() {
        Topbar(
            currentScreen = currentScreen,
            uiLayout = uiLayout,
            onBackButtonClicked = { navController.navigateUp() },
            canNavigateBack = navController.previousBackStackEntry != null,
            //modifier = modifier.height(80.dp)
        )
        when(uiLayout) {
            UiLayout.MEDIUM -> {
                MediumOrientation(
                    uiState = uiState,
                    onCategoryClicked = onCategoryClicked,
                    onCreationClicked = onCreationClicked,
                    modifier = modifier
                )
            }
            UiLayout.EXPANDED -> {
                ExpandedOrientation(
                    uiState = uiState,
                    onCategoryClicked = onCategoryClicked,
                    onCreationClicked = onCreationClicked,
                    modifier = modifier
                )
            }
            UiLayout.COMPACT -> {
                CompactOrientation(
                    navController = navController,
                    uiState = uiState,
                    onCategoryClicked = { creation ->
                        onCategoryClicked(creation)
                        navController.navigate(AiCreationUiScreen.Creations.name)
                    },
                    onCreationClicked = { creation ->
                        onCategoryClicked(creation)
                            .also { navController.navigate(AiCreationUiScreen.Details.name) }
                            // Test: found this in code preview TODO: remove/change Test
                    },
                    modifier = modifier
                )
            }
        }
    }
}

@Composable
private fun CompactOrientation(
    navController: NavHostController,
    uiState: AiCreationsUiState,
    onCategoryClicked: (Creation) -> Unit,
    onCreationClicked: (Creation) -> Unit,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = AiCreationUiScreen.Category.name,
        modifier = modifier
    ) {
        composable(
            route = AiCreationUiScreen.Category.name
        ) {
            CategoryList(
                uiState = uiState,
                onCategoryClicked = onCategoryClicked,
                uiLayout = UiLayout.COMPACT,
                modifier = Modifier
            )
        }
        composable(route = AiCreationUiScreen.Creations.name) {
            CreationList(
                uiState = uiState,
                uiLayout = UiLayout.COMPACT,
                onCreationClicked = onCreationClicked,
                modifier = Modifier

            )
        }
        composable(route = AiCreationUiScreen.Details.name) {
            DetailScreen(
                uiState = uiState,
                uiLayout = UiLayout.COMPACT,
            )
        }
    }
}
@Composable
private fun MediumOrientation(
    uiState: AiCreationsUiState,
    onCategoryClicked: (Creation) -> Unit,
    onCreationClicked: (Creation) -> Unit,
    modifier: Modifier = Modifier
) {
    ExpandedOrientation(
        uiState = uiState,
        onCategoryClicked = onCategoryClicked,
        onCreationClicked = onCreationClicked,
        modifier = modifier
    )
}

@Composable
private fun ExpandedOrientation(
    uiState: AiCreationsUiState,
    onCategoryClicked: (Creation) -> Unit,
    onCreationClicked: (Creation) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier.fillMaxSize()//.padding(innerPadding)

    ) {
        CategoryList(
            uiState = uiState,
            uiLayout = UiLayout.EXPANDED,
            onCategoryClicked = onCategoryClicked,
            modifier = modifier
                .width(200.dp)
        )
        CreationList(
            uiState = uiState,
            uiLayout = UiLayout.EXPANDED,
            onCreationClicked = onCreationClicked,
            modifier = modifier
                .weight(0.3f)
        )
        DetailScreen(
            uiState = uiState,
            uiLayout = UiLayout.EXPANDED,
            modifier = modifier
                .weight(0.5f)
        )
    }
}

