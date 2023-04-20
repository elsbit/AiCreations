package com.example.aicreations.ui

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.aicreations.ui.utils.UiLayout


private const val TAG = "UIDetailScreen"

@Composable
fun DetailScreen(
    uiState: AiCreationsUiState,
    uiLayout: UiLayout,
    modifier: Modifier = Modifier
) {
    when(uiLayout) {
        UiLayout.COMPACT -> {
            Log.d(TAG,":layout -> ${uiLayout.name}")
            CompactDetailScreen(
                uiState = uiState,
                modifier = modifier
            )
        }
        UiLayout.MEDIUM,
        UiLayout.EXPANDED -> {
            Log.d(TAG,":layout -> ${uiLayout.name}")
            CompactDetailScreen(
                uiState = uiState,
                modifier = modifier
            )
        }
    }
}

@Composable
private fun CompactDetailScreen(
    uiState: AiCreationsUiState,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        item {
            Card(
                elevation = 5.dp,
                modifier = modifier
                    .fillMaxSize()
                    .padding(12.dp),
                shape = RoundedCornerShape(8)

            ) {
                Image(
                    painter = painterResource(id = uiState.currentCreation.imageId),
                    contentDescription = stringResource(id = uiState.currentCreation.descriptionId),
                    modifier = Modifier,
                    contentScale = ContentScale.Crop
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewOfDetailScreenInCompactLayout() {
    val viewModel: AiCreationsViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    DetailScreen(
        uiState = uiState,
        uiLayout = UiLayout.COMPACT
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewOfDetailScreenInExpandedLayout() {
    val viewModel: AiCreationsViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    DetailScreen(
        uiState = uiState,
        uiLayout = UiLayout.EXPANDED
    )
}