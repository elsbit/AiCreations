package com.example.aicreations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.aicreations.R

abstract class Creation(

) {
    @get:DrawableRes abstract val imageId: Int
    @get:StringRes abstract val descriptionId: Int
    @get:StringRes abstract val categoryId: Int
    @get:StringRes abstract val aiModelNameId: Int
}
