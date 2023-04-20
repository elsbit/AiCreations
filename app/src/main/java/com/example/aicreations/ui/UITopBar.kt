package com.example.aicreations.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aicreations.R
import com.example.aicreations.ui.utils.UiLayout

/*
@Composable
fun AiCreationsUiTopBar(
    currentScreen: AiCreationUiScreen,
    uiLayout: UiLayout,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier,
    canNavigateBack: Boolean = false
) {
    TopAppBar(
        title = {
            Text(
                text = when(uiLayout) {
                    UiLayout.COMPACT -> stringResource(id = currentScreen.title)
                    else -> stringResource(id = R.string.app_topbar_title)
                },
                style = MaterialTheme.typography.h1
            )
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
*/

@Composable
fun Topbar(
    currentScreen: AiCreationUiScreen,
    uiLayout: UiLayout,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier,
    canNavigateBack: Boolean
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)

    ) {
        IconButton(onClick = onBackButtonClicked) {
            when(canNavigateBack) {
                true -> {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(id = R.string.app_topbar_button_back))
                }
                else -> null
            }
        }
        Text(
            text = when(uiLayout) {
                UiLayout.COMPACT -> stringResource(id = currentScreen.title)
                else -> stringResource(id = R.string.app_topbar_title)
            },
            style = MaterialTheme.typography.h1
        )
    }
}

@Preview(showBackground = true, widthDp = 400)
@Composable
fun PreviewOfTopBar() {
    Topbar(
        onBackButtonClicked = { /*Nothing, just a preview*/ },
        uiLayout = UiLayout.COMPACT,
        canNavigateBack = false,
        currentScreen = AiCreationUiScreen.Category
    )
}