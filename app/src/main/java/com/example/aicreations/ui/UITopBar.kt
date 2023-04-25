package com.example.aicreations.ui

import android.util.Log
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aicreations.R
import com.example.aicreations.ui.utils.UiLayout

private const val TAG = "TOPBAR"
@Composable
fun Topbar(
    currentScreen: AiCreationUiScreen,
    uiLayout: UiLayout,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier,
    canNavigateBack: Boolean,
    isExpanded: Boolean = false
) {

    var isExpended by remember { mutableStateOf(isExpanded) }

    Column(
        modifier = modifier
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioLowBouncy,
                    stiffness = Spring.StiffnessMediumLow
                )
            )

    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)

        ) {
            IconButton(onClick = onBackButtonClicked) {
                when (canNavigateBack) {
                    true -> {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(id = R.string.app_topbar_button_back)
                        )
                    }

                    else -> null
                }
            }
            Text(
                text = when (uiLayout) {
                    UiLayout.COMPACT -> stringResource(id = currentScreen.title)
                    else -> stringResource(id = R.string.app_topbar_title)
                },
                style = MaterialTheme.typography.h1
            )
            IconButton(onClick = {
                isExpended = !isExpended
                Log.d(TAG, "show information pressed=$isExpended")
            }
            ) {
                if(currentScreen!=AiCreationUiScreen.Details) {
                    Icon(
                        imageVector = if (isExpended) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                        contentDescription = stringResource(id = R.string.app_topbar_information)
                    )
                }
            }
        }
        if (isExpended && currentScreen!=AiCreationUiScreen.Details) {
            Column(
                modifier = Modifier.padding(24.dp)
            ) {
                Text(
                    text = stringResource(id = currentScreen.info),
                    style = MaterialTheme.typography.body2,
                    textAlign = TextAlign.Center,

                )
                Log.d(TAG,"Info should be visible!")
            }
        }
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