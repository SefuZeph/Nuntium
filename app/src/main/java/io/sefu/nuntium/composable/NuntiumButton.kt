package io.sefu.nuntium.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.sefu.nuntium.designsystem.NuntiumTheme

@Composable
fun NuntiumButton(modifier: Modifier = Modifier, textValue: String = "") {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = NuntiumTheme.colors.primaryPurple,
            contentColor = NuntiumTheme.colors.white
        ),
        shape = NuntiumTheme.shapes.medium
    ) {
        NuntiumText(
            text = textValue, style = TextStyle(
                fontSize = 16.sp,
                color = NuntiumTheme.colors.white,
                fontWeight = FontWeight.SemiBold
            )
        )
    }
}