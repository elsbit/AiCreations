package com.example.aicreations.ui

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.aicreations.R
import com.example.aicreations.data.Datasource
import com.example.aicreations.model.Creation
import com.example.aicreations.ui.utils.UiLayout

@Composable
fun AiCreationsUiTopBar(
    creation: Creation,
    onBackButtonClicked: () -> Unit,
    componentLayout: UiLayout,
    modifier: Modifier = Modifier
) {
    val isShowingCompactLayout = (componentLayout==UiLayout.COMPACT)
    TopAppBar(
        title = {
            Text(
                if(isShowingCompactLayout) {
                    componentLayout.name //TODO: Hardcoded String
                }
                else {
                    componentLayout.name//TODO: Hardcoded String
                }
            )
        },
        navigationIcon = {
            IconButton(onClick = onBackButtonClicked) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = stringResource(id = R.string.app_button_topbar_back)
                )
            }
        },
        modifier = modifier
    )
}

@Preview(showBackground = true, widthDp = 400)
@Composable
fun PreviewOfTopBar() {
    AiCreationsUiTopBar(
        creation = Datasource.defaultCreation,
        onBackButtonClicked = { /*TODO*/ },
        componentLayout = UiLayout.COMPACT)
}