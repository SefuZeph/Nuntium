package io.sefu.nuntium.designsystem

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

class NuntiumShapes(
    val small: CornerBasedShape = RoundedCornerShape(8.dp),
    val medium: CornerBasedShape = RoundedCornerShape(12.dp),
    val large: CornerBasedShape = RoundedCornerShape(45.dp)
) {

    fun copy(
        small: CornerBasedShape = this.small,
        medium: CornerBasedShape = this.medium,
        large: CornerBasedShape = this.large
    ): NuntiumShapes = NuntiumShapes(
        small = small,
        medium = medium,
        large = large,
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NuntiumShapes) return false
        if (small != other.small) return false
        if (medium != other.medium) return false
        if (large != other.large) return false
        return true
    }

    override fun hashCode(): Int {
        var result = small.hashCode()
        result = 31 * result + medium.hashCode()
        result = 31 * result + large.hashCode()
        return result
    }

    override fun toString(): String {
        return "Space shapes(small=$small, medium=$medium, large=$large)"
    }
}

internal val LocalShapes = staticCompositionLocalOf { NuntiumShapes() }
