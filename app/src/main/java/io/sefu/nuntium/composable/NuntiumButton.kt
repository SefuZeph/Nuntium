package io.sefu.nuntium.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.sefu.nuntium.designsystem.NuntiumTheme

@Composable
fun NuntiumButton(modifier: Modifier = Modifier, textValue: String = "", onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
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

@Composable
fun NuntiumSocialButton(
    modifier: Modifier = Modifier, textValue: String = "", onClick: () -> Unit, socialIcon: Int
) {
    Button(
        onClick = { onClick() },
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = NuntiumTheme.shapes.medium,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = NuntiumTheme.colors.white, contentColor = NuntiumTheme.colors.white
        ),
        border = BorderStroke(width = 1.dp, color = NuntiumTheme.colors.greyLighter),
        elevation = ButtonDefaults.elevation(defaultElevation = 0.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = socialIcon),
                modifier = Modifier.size(24.dp),
                contentDescription = "social icon"
            )
            NuntiumText(
                text = textValue, modifier = Modifier.fillMaxWidth(), style = TextStyle(
                    color = NuntiumTheme.colors.greyDark,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
    }
}