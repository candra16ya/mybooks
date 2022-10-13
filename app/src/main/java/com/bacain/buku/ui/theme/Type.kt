package com.bacain.buku.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.bacain.buku.R

//Import font
val lexend = FontFamily(
    Font(R.font.lexend_regular),
    Font(R.font.lexend_light, FontWeight.Light),
    Font(R.font.lexend_semibold, FontWeight.SemiBold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = lexend,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = lexend,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp
    ),
    h4 = TextStyle(
        fontFamily = lexend,
        fontWeight = FontWeight.SemiBold,
        fontSize = 27.sp
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