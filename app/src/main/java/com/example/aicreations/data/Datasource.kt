package com.example.aicreations.data

import androidx.annotation.StringRes
import com.example.aicreations.R
import com.example.aicreations.model.Creation
import com.example.aicreations.model.StableDiffusionCreation

object Datasource {
    val defaultCategory = R.string.category__abstract_art
    val defaultCreation = StableDiffusionCreation(
        imageId = R.drawable.image_abstract_art_01,
        descriptionId = R.string.image_abstract_art_01_prompt,
        categoryId = R.string.category__abstract_art,
    )

    val stableDiffusionCreations: List<StableDiffusionCreation> = listOf(
        //CATEGORY: abstract art
        StableDiffusionCreation(
            imageId = R.drawable.image_abstract_art_01,
            descriptionId = R.string.image_abstract_art_01_prompt,
            categoryId = R.string.category__abstract_art,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_abstract_art_02,
            descriptionId = R.string.image_abstract_art_02_prompt,
            categoryId = R.string.category__abstract_art,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_abstract_art_03,
            descriptionId = R.string.image_abstract_art_03_prompt,
            categoryId = R.string.category__abstract_art,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_abstract_art_04,
            descriptionId = R.string.image_abstract_art_04_prompt,
            categoryId = R.string.category__abstract_art,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_abstract_art_05,
            descriptionId = R.string.image_abstract_art_05_prompt,
            categoryId = R.string.category__abstract_art,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_abstract_art_06,
            descriptionId = R.string.image_abstract_art_06_prompt,
            categoryId = R.string.category__abstract_art,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_abstract_art_07,
            descriptionId = R.string.image_abstract_art_07_prompt,
            categoryId = R.string.category__abstract_art,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_abstract_art_08,
            descriptionId = R.string.image_abstract_art_08_prompt,
            categoryId = R.string.category__abstract_art,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_abstract_art_09,
            descriptionId = R.string.image_abstract_art_09_prompt,
            categoryId = R.string.category__abstract_art,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_abstract_art_10,
            descriptionId = R.string.image_abstract_art_10_prompt,
            categoryId = R.string.category__abstract_art,
        ),
        //CATEGORY: animals
        StableDiffusionCreation(
            imageId = R.drawable.image_animal_01,
            descriptionId = R.string.image_animal_01_prompt,
            categoryId = R.string.category__animal,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_animal_02,
            descriptionId = R.string.image_animal_02_prompt,
            categoryId = R.string.category__animal,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_animal_03,
            descriptionId = R.string.image_animal_03_prompt,
            categoryId = R.string.category__animal,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_animal_04,
            descriptionId = R.string.image_animal_04_prompt,
            categoryId = R.string.category__animal,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_animal_05,
            descriptionId = R.string.image_animal_05_prompt,
            categoryId = R.string.category__animal,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_animal_06,
            descriptionId = R.string.image_animal_06_prompt,
            categoryId = R.string.category__animal,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_animal_07,
            descriptionId = R.string.image_animal_07_prompt,
            categoryId = R.string.category__animal,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_animal_08,
            descriptionId = R.string.image_animal_08_prompt,
            categoryId = R.string.category__animal,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_animal_09,
            descriptionId = R.string.image_animal_09_prompt,
            categoryId = R.string.category__animal,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_animal_10,
            descriptionId = R.string.image_animal_10_prompt,
            categoryId = R.string.category__animal,
        ),
    )


    var creationsGroupedByCategory: Map<Int,List<StableDiffusionCreation>> = Datasource.stableDiffusionCreations.groupBy { it.categoryId }

}

