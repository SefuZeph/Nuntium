package io.sefu.nuntium.designsystem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

@Composable
fun NuntiumTheme(
    colors: NuntiumColors = NuntiumTheme.colors,
    typography: NuntiumTypography = NuntiumTheme.typography,
    shapes: NuntiumShapes = NuntiumTheme.shapes,
    content: @Composable () -> Unit
) {

    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography,
        LocalShapes provides shapes
    ) {
        content()
    }
}

object NuntiumTheme {
    val colors: NuntiumColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: NuntiumTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val shapes: NuntiumShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current
}