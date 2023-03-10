package io.sefu.nuntium.composable

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.sefu.nuntium.designsystem.NuntiumTheme

@Composable
fun HeaderDescriptionTopBar(
    header: String = "", description: String = "", content: @Composable BoxScope.() -> Unit
) {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp)) {
        NuntiumText(
            text = header, style = NuntiumTheme.typography.h2.copy(
                fontWeight = FontWeight.SemiBold, fontSize = 32.sp
            ), textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.height(8.dp))
        NuntiumText(
            text = description,
            style = NuntiumTheme.typography.h5.copy(fontWeight = FontWeight.Normal, fontSize = 16.sp, color = NuntiumTheme.colors.greyPrimary),
            textAlign = TextAlign.Start
        )

        Box(content = content, modifier = Modifier.fillMaxSize())
    }
}