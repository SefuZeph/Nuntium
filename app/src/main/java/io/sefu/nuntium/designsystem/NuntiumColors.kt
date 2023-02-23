package io.sefu.nuntium.designsystem

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse

@Stable
class NuntiumColors(
    white: Color,
    purpleDark: Color,
    primaryPurple: Color,
    lightPurple: Color,
    lighterPurple: Color,
    blackDark: Color,
    blackPrimary: Color,
    lightBlack: Color,
    lighterBlack: Color,
    greyDark: Color,
    greyPrimary: Color,
    greyLight: Color,
    greyLighter: Color,
    isLight: Boolean,
) {
    val white by mutableStateOf(white, structuralEqualityPolicy())
    val purpleDark by mutableStateOf(purpleDark, structuralEqualityPolicy())
    val primaryPurple by mutableStateOf(primaryPurple, structuralEqualityPolicy())
    val lightPurple by mutableStateOf(lightPurple, structuralEqualityPolicy())
    val lighterPurple by mutableStateOf(lighterPurple, structuralEqualityPolicy())
    val blackDark by mutableStateOf(blackDark, structuralEqualityPolicy())
    val blackPrimary by mutableStateOf(blackPrimary, structuralEqualityPolicy())
    val lightBlack by mutableStateOf(lightBlack, structuralEqualityPolicy())
    val lighterBlack by mutableStateOf(lighterBlack, structuralEqualityPolicy())
    val greyDark by mutableStateOf(greyDark, structuralEqualityPolicy())
    val greyPrimary by mutableStateOf(greyPrimary, structuralEqualityPolicy())
    val greyLight by mutableStateOf(greyLight, structuralEqualityPolicy())
    val greyLighter by mutableStateOf(greyLighter, structuralEqualityPolicy())

    var isLight by mutableStateOf(isLight, structuralEqualityPolicy())
        internal set

    fun copy(
        white: Color = this.white,
        purpleDark: Color = this.purpleDark,
        primaryPurple: Color = this.primaryPurple,
        lightPurple: Color = this.lightPurple,
        lighterPurple: Color = this.lighterPurple,
        blackDark: Color = this.blackDark,
        blackPrimary: Color = this.blackPrimary,
        lightBlack: Color = this.lightBlack,
        lighterBlack: Color = this.lighterBlack,
        greyDark: Color = this.greyDark,
        greyPrimary: Color = this.greyPrimary,
        greyLight: Color = this.greyLight,
        greyLighter: Color = this.greyLighter,
        isLight: Boolean = this.isLight,
    ): NuntiumColors = NuntiumColors(
        white,
        purpleDark,
        primaryPurple,
        lightPurple,
        lighterPurple,
        blackDark,
        blackPrimary,
        lightBlack,
        lighterBlack,
        greyDark,
        greyPrimary,
        greyLight,
        greyLighter,
        isLight
    )
}


fun lightSpaceColors(
    white: Color = Color(0XFFFFFFFF),
    purpleDark: Color = Color(0XFF2536A7),
    primaryPurple: Color = Color(0XFF475AD7),
    lightPurple: Color = Color(0XFF8A96E5),
    lighterPurple: Color = Color(0XFFEEF0FB),
    blackDark: Color = Color(0XFF22242F),
    blackPrimary: Color = Color(0XFF333647),
    lightBlack: Color = Color(0XFF44485F),
    lighterBlack: Color = Color(0XFF555A77),
    greyDark: Color = Color(0XFF666C8E),
    greyPrimary: Color = Color(0XFF7C82A1),
    greyLight: Color = Color(0XFFACAFC3),
    greyLighter: Color = Color(0XFFF3F4F6),
    isLight: Boolean = true,
): NuntiumColors = NuntiumColors(
    white,
    purpleDark,
    primaryPurple,
    lightPurple,
    lighterPurple,
    blackDark,
    blackPrimary,
    lightBlack,
    lighterBlack,
    greyDark,
    greyPrimary,
    greyLight,
    greyLighter,
    isLight
)

fun darkSpaceColors() = lightSpaceColors(isLight = false)

internal val LocalColors = staticCompositionLocalOf { lightSpaceColors() }

internal val LocalContentColor = compositionLocalOf { Color.Black }

internal val LocalContentAlpha = compositionLocalOf { 1f }