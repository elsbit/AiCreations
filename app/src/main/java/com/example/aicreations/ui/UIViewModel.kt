package com.example.aicreations.ui

import androidx.lifecycle.ViewModel
import com.example.aicreations.data.Datasource
import com.example.aicreations.model.Creation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class AiCreationsViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        AiCreationsUiState(Datasource.creationsGroupedByCategory)
    )
    val uiState: StateFlow<AiCreationsUiState> = _uiState

    fun updateCurrentCreation(selectedCreation: Creation) {
        _uiState.update {
            it.copy(
                currentCreation = selectedCreation,
                currentCategory = selectedCreation.categoryId
            )
        }
    }
}

data class AiCreationsUiState(
    val creations: Map<Int,List<Creation>>,
    val currentCategory: Int = Datasource.defaultCategory,
    //val currentCreations: List<Creation>, TODO Remove?
    val currentCreation: Creation = Datasource.defaultCreation

) {

}