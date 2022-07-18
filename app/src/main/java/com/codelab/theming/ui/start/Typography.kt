package com.codelab.theming.ui.start

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codelab.theming.R

private val MontSerrat = FontFamily(
    Font(R.font.montserrat_regular),
    Font(R.font.montserrat_medium, FontWeight.W500),
    Font(R.font.montserrat_semibold, FontWeight.W600)
)

private val Domine = FontFamily(
    Font(R.font.domine_regular, FontWeight.Normal),
    Font(R.font.domine_bold, FontWeight.Bold)
)

val JetnewsTypography = Typography(
    h4 = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.W600,
        fontSize = 30.sp
    ),
    h5 = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.W500,
        fontSize = 24.sp
    ),
    h6 = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.W500,
        fontSize = 20.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = Domine,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    overline = TextStyle(
        fontFamily = MontSerrat,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp
    )

)