package io.sefu.nuntium.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.sefu.nuntium.designsystem.NuntiumTheme

@Composable
fun NuntiumTopicCard(topicName: String, modifier: Modifier, isSelected: Boolean) {
    Box(
        modifier = modifier
            .height(72.dp)
            .fillMaxWidth()
            .background(
                color = if (isSelected) NuntiumTheme.colors.primaryPurple else NuntiumTheme.colors.greyLighter,
                shape = NuntiumTheme.shapes.medium
            ), contentAlignment = Alignment.Center
    ) {
        NuntiumText(text = topicName, style = NuntiumTheme.typography.h4.copy(color = if(isSelected) NuntiumTheme.colors.white else NuntiumTheme.colors.greyDark))
    }
}