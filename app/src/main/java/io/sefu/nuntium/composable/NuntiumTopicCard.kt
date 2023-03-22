package io.sefu.nuntium.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.sefu.nuntium.designsystem.NuntiumTheme

@Composable
fun NuntiumTopicCard(topicName: String,modifier: Modifier) {
    Box(
        modifier = modifier
            .height(72.dp)
            .fillMaxWidth()
            .background(color = NuntiumTheme.colors.greyLighter, shape = NuntiumTheme.shapes.medium),
        contentAlignment = Alignment.Center
    ) {
        NuntiumText(text = topicName)
    }
}