package com.example.aicreations.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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


@Composable
fun DetailScreen(
    uiState: AiCreationsUiState,
    modifier: Modifier = Modifier
) {
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

@Preview(showBackground = true)
@Composable
fun PreviewOfDetailScreen() {
    val viewModel: AiCreationsViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    DetailScreen(
        uiState = uiState,
    )
}
