package com.example.aicreations.data

import com.example.aicreations.R
import com.example.aicreations.model.StableDiffusionCreation

object Datasource {
    val defaultCategory = R.string.category__abstract_art
    val defaultCreation = StableDiffusionCreation(
        imageId = R.drawable.image_abstract_art_01,
        descriptionId = R.string.image_abstract_art_01_prompt,
        categoryId = R.string.category__abstract_art,
    )

    private val stableDiffusionCreations: List<StableDiffusionCreation> = listOf(
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
        StableDiffusionCreation(
            imageId = R.drawable.image_city_01,
            descriptionId = R.string.image_city_01_prompt,
            categoryId = R.string.category__city,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_city_02,
            descriptionId = R.string.image_city_02_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_03,
            descriptionId = R.string.image_city_03_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_04,
            descriptionId = R.string.image_city_04_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_05,
            descriptionId = R.string.image_city_05_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_06,
            descriptionId = R.string.image_city_06_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_07,
            descriptionId = R.string.image_city_07_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_08,
            descriptionId = R.string.image_city_08_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_09,
            descriptionId = R.string.image_city_09_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_10,
            descriptionId = R.string.image_city_10_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_11,
            descriptionId = R.string.image_city_11_prompt,
            categoryId = R.string.category__city,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_city_12,
            descriptionId = R.string.image_city_12_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_13,
            descriptionId = R.string.image_city_13_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_14,
            descriptionId = R.string.image_city_14_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_15,
            descriptionId = R.string.image_city_15_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_16,
            descriptionId = R.string.image_city_16_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_17,
            descriptionId = R.string.image_city_17_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_18,
            descriptionId = R.string.image_city_18_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_19,
            descriptionId = R.string.image_city_19_prompt,
            categoryId = R.string.category__city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_city_20,
            descriptionId = R.string.image_city_20_prompt,
            categoryId = R.string.category__city,
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_desert_01,
            descriptionId = R.string.image_desert_01_prompt,
            categoryId = R.string.category__desert
        ),
        StableDiffusionCreation(
            imageId = R.drawable.image_desert_02,
            descriptionId = R.string.image_desert_02_prompt,
            categoryId = R.string.category__desert,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_desert_03,
            descriptionId = R.string.image_desert_03_prompt,
            categoryId = R.string.category__desert,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_desert_04,
            descriptionId = R.string.image_desert_04_prompt,
            categoryId = R.string.category__desert,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_desert_05,
            descriptionId = R.string.image_desert_05_prompt,
            categoryId = R.string.category__desert,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_desert_06,
            descriptionId = R.string.image_desert_06_prompt,
            categoryId = R.string.category__desert,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_desert_07,
            descriptionId = R.string.image_desert_07_prompt,
            categoryId = R.string.category__desert,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_desert_08,
            descriptionId = R.string.image_desert_08_prompt,
            categoryId = R.string.category__desert,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_desert_09,
            descriptionId = R.string.image_desert_09_prompt,
            categoryId = R.string.category__desert,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_desert_10,
            descriptionId = R.string.image_desert_10_prompt,
            categoryId = R.string.category__desert,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_fantasy_creature_01,
            descriptionId = R.string.image_fantasy_creature_01_prompt,
            categoryId = R.string.category__fantasy_creature,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_fantasy_creature_02,
            descriptionId = R.string.image_fantasy_creature_02_prompt,
            categoryId = R.string.category__fantasy_creature,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_fantasy_creature_03,
            descriptionId = R.string.image_fantasy_creature_03_prompt,
            categoryId = R.string.category__fantasy_creature,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_fantasy_creature_04,
            descriptionId = R.string.image_fantasy_creature_04_prompt,
            categoryId = R.string.category__fantasy_creature,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_fantasy_creature_05,
            descriptionId = R.string.image_fantasy_creature_05_prompt,
            categoryId = R.string.category__fantasy_creature,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_fantasy_creature_06,
            descriptionId = R.string.image_fantasy_creature_06_prompt,
            categoryId = R.string.category__fantasy_creature,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_fantasy_creature_07,
            descriptionId = R.string.image_fantasy_creature_07_prompt,
            categoryId = R.string.category__fantasy_creature,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_fantasy_creature_08,
            descriptionId = R.string.image_fantasy_creature_08_prompt,
            categoryId = R.string.category__fantasy_creature,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_fantasy_creature_09,
            descriptionId = R.string.image_fantasy_creature_09_prompt,
            categoryId = R.string.category__fantasy_creature,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_fantasy_creature_10,
            descriptionId = R.string.image_fantasy_creature_10_prompt,
            categoryId = R.string.category__fantasy_creature,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_food_01,
            descriptionId = R.string.image_food_01_prompt,
            categoryId = R.string.category__food,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_food_02,
            descriptionId = R.string.image_food_02_prompt,
            categoryId = R.string.category__food,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_food_03,
            descriptionId = R.string.image_food_03_prompt,
            categoryId = R.string.category__food,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_food_04,
            descriptionId = R.string.image_food_04_prompt,
            categoryId = R.string.category__food,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_food_05,
            descriptionId = R.string.image_food_05_prompt,
            categoryId = R.string.category__food,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_food_06,
            descriptionId = R.string.image_food_06_prompt,
            categoryId = R.string.category__food,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_food_07,
            descriptionId = R.string.image_food_07_prompt,
            categoryId = R.string.category__food,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_food_08,
            descriptionId = R.string.image_food_08_prompt,
            categoryId = R.string.category__food,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_food_09,
            descriptionId = R.string.image_food_09_prompt,
            categoryId = R.string.category__food,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_food_10,
            descriptionId = R.string.image_food_10_prompt,
            categoryId = R.string.category__food,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_01,
            descriptionId = R.string.image_forest_01_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_02,
            descriptionId = R.string.image_forest_02_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_03,
            descriptionId = R.string.image_forest_03_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_04,
            descriptionId = R.string.image_forest_04_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_05,
            descriptionId = R.string.image_forest_05_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_06,
            descriptionId = R.string.image_forest_06_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_07,
            descriptionId = R.string.image_forest_07_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_08,
            descriptionId = R.string.image_forest_08_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_09,
            descriptionId = R.string.image_forest_09_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_10,
            descriptionId = R.string.image_forest_10_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_forest_10,
            descriptionId = R.string.image_forest_10_prompt,
            categoryId = R.string.category__forest,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_futuristic_city_01,
            descriptionId = R.string.image_futuristic_city_01_prompt,
            categoryId = R.string.category__futuristic_city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_futuristic_city_02,
            descriptionId = R.string.image_futuristic_city_02_prompt,
            categoryId = R.string.category__futuristic_city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_futuristic_city_03,
            descriptionId = R.string.image_futuristic_city_03_prompt,
            categoryId = R.string.category__futuristic_city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_futuristic_city_04,
            descriptionId = R.string.image_futuristic_city_04_prompt,
            categoryId = R.string.category__futuristic_city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_futuristic_city_05,
            descriptionId = R.string.image_futuristic_city_05_prompt,
            categoryId = R.string.category__futuristic_city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_futuristic_city_06,
            descriptionId = R.string.image_futuristic_city_06_prompt,
            categoryId = R.string.category__futuristic_city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_futuristic_city_07,
            descriptionId = R.string.image_futuristic_city_07_prompt,
            categoryId = R.string.category__futuristic_city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_futuristic_city_08,
            descriptionId = R.string.image_futuristic_city_08_prompt,
            categoryId = R.string.category__futuristic_city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_futuristic_city_09,
            descriptionId = R.string.image_futuristic_city_09_prompt,
            categoryId = R.string.category__futuristic_city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_futuristic_city_10,
            descriptionId = R.string.image_futuristic_city_10_prompt,
            categoryId = R.string.category__futuristic_city,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_01,
            descriptionId = R.string.image_landscape_01_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_02,
            descriptionId = R.string.image_landscape_02_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_03,
            descriptionId = R.string.image_landscape_03_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_04,
            descriptionId = R.string.image_landscape_04_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_05,
            descriptionId = R.string.image_landscape_05_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_06,
            descriptionId = R.string.image_landscape_06_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_07,
            descriptionId = R.string.image_landscape_07_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_08,
            descriptionId = R.string.image_landscape_08_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_09,
            descriptionId = R.string.image_landscape_09_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_10,
            descriptionId = R.string.image_landscape_10_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_11,
            descriptionId = R.string.image_landscape_11_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_12,
            descriptionId = R.string.image_landscape_12_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_13,
            descriptionId = R.string.image_landscape_13_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_14,
            descriptionId = R.string.image_landscape_14_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_15,
            descriptionId = R.string.image_landscape_15_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_16,
            descriptionId = R.string.image_landscape_16_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_17,
            descriptionId = R.string.image_landscape_17_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_18,
            descriptionId = R.string.image_landscape_18_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_19,
            descriptionId = R.string.image_landscape_19_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_landscape_20,
            descriptionId = R.string.image_landscape_20_prompt,
            categoryId = R.string.category__landscape,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_science_fiction_01,
            descriptionId = R.string.image_science_fiction_01_prompt,
            categoryId = R.string.category__science_fiction,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_science_fiction_02,
            descriptionId = R.string.image_science_fiction_02_prompt,
            categoryId = R.string.category__science_fiction,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_science_fiction_03,
            descriptionId = R.string.image_science_fiction_03_prompt,
            categoryId = R.string.category__science_fiction,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_science_fiction_04,
            descriptionId = R.string.image_science_fiction_04_prompt,
            categoryId = R.string.category__science_fiction,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_science_fiction_05,
            descriptionId = R.string.image_science_fiction_05_prompt,
            categoryId = R.string.category__science_fiction,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_science_fiction_06,
            descriptionId = R.string.image_science_fiction_06_prompt,
            categoryId = R.string.category__science_fiction,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_science_fiction_07,
            descriptionId = R.string.image_science_fiction_07_prompt,
            categoryId = R.string.category__science_fiction,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_science_fiction_08,
            descriptionId = R.string.image_science_fiction_08_prompt,
            categoryId = R.string.category__science_fiction,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_science_fiction_09,
            descriptionId = R.string.image_science_fiction_09_prompt,
            categoryId = R.string.category__science_fiction,
        ),

        StableDiffusionCreation(
            imageId = R.drawable.image_science_fiction_10,
            descriptionId = R.string.image_science_fiction_10_prompt,
            categoryId = R.string.category__science_fiction,
        ),

    )

    var creationsGroupedByCategory: Map<Int,List<StableDiffusionCreation>> = Datasource.stableDiffusionCreations.groupBy { it.categoryId }

}

