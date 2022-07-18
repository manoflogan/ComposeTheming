package com.codelab.theming.ui.start

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun JetnewsTheme(isDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable ()-> Unit) {
    MaterialTheme(
        content = content,
        colors = if (isDarkTheme) DarkColours else LightColours,
        typography = JetnewsTypography,
        shapes = JetNewsShapes
    )
}

private val LightColours = lightColors(
    primary = Red700,
    primaryVariant = Red900,
    secondary = Red700,
    secondaryVariant = Red900,
    error = Red800,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Color.Black,
    onError = Color.White
)

private val DarkColours = darkColors(
    primary = Red300,
    primaryVariant = Red700,
    background = Color.Black,
    secondary = Red300,
    surface = Color.Black,
    error = Red200,
    onSurface = Color.White,
    onBackground = Color.White
)