package io.sefu.nuntium.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import io.sefu.nuntium.designsystem.*
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkSpaceColors()

private val LightColorPalette = lightSpaceColors()

@Composable
fun ComposeDesignSystemTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(
        color = NuntiumTheme.colors.primaryPurple,
    )
    systemUiController.setNavigationBarColor(
        color = NuntiumTheme.colors.primaryPurple
    )

    NuntiumTheme(
        colors = colors,
        typography = NuntiumTypography(),
        shapes = NuntiumShapes(),
        content = content
    )
}