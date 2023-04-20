package com.example.aicreations.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.aicreations.R

val source_serif_pro = FontFamily(
    Font(R.font.source_serif_pro_regular,FontWeight.Normal),
    Font(R.font.source_serif_pro_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with



val Typography = Typography(
    h1 = TextStyle(
        fontFamily = source_serif_pro,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontFamily = source_serif_pro,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),

    body1 = TextStyle(
        fontFamily = source_serif_pro,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = source_serif_pro,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    caption = TextStyle(
        fontFamily = source_serif_pro,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp

    )

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)