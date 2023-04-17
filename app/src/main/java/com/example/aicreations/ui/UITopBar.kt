package com.example.aicreations.ui

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.aicreations.R
import com.example.aicreations.ui.utils.UiLayout

@Composable
fun AiCreationsUiTopBar(
    currentScreen: AiCreationUiScreen,
    onBackButtonClicked: () -> Unit,
    uiLayout: UiLayout,
    modifier: Modifier = Modifier,
    canNavigateBack: Boolean = false
) {
    TopAppBar(
        title = {
            Text(stringResource(id = currentScreen.title))
        },
        navigationIcon = {
            if(canNavigateBack) {
                IconButton(onClick = onBackButtonClicked) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(id = R.string.app_topbar_button_back)
                    )

                }
            }
        },
        modifier = modifier,
    )
}

@Preview(showBackground = true, widthDp = 400)
@Composable
fun PreviewOfTopBar() {
    AiCreationsUiTopBar(
        onBackButtonClicked = { /*TODO*/ },
        uiLayout = UiLayout.COMPACT,
        canNavigateBack = false,
        currentScreen = AiCreationUiScreen.Category
    )
}