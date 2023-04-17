package com.example.aicreations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.aicreations.R

data class StableDiffusionCreation (
    @DrawableRes override val imageId: Int,
    @StringRes override val descriptionId: Int,
    @StringRes override val categoryId: Int,
    @StringRes override val aiModelNameId: Int = R.string.models_creation_aiModel_Stable_Diffusion,
) : Creation()
