package io.sefu.nuntium.presentation.authentication

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import io.sefu.nuntium.R
import io.sefu.nuntium.composable.*
import io.sefu.nuntium.designsystem.NuntiumTheme
import io.sefu.nuntium.navigation.Screens

@Composable
fun ForgotPasswordScreen(navController: NavController) {
    HeaderDescriptionTopBar(
        header = "Forgot Password \uD83E\uDD14",
        description = "We need your email adress so we can send you the password reset code."
    ) {
        LazyColumn(content = {
            item {
                Spacer(modifier = Modifier.height(32.dp))
                NuntiumEditText(
                    modifier = Modifier.fillMaxWidth(),
                    "Email Address",
                    imagePlaceHolder = R.drawable.email_inac,
                    iconHeight = 16.dp,
                    iconWidth = 20.dp
                )

                Spacer(modifier = Modifier.height(24.dp))

                NuntiumButton(modifier = Modifier.fillMaxWidth(), textValue = "Next") {
                    navController.navigate(Screens.OTPScreen.routes)
                }
            }
        })
        Row(
            modifier = Modifier.fillMaxWidth().align(alignment = Alignment.BottomCenter),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            NuntiumText(
                text = "Remember the password?", modifier = Modifier, style = TextStyle(
                    color = NuntiumTheme.colors.greyPrimary,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            )
            Spacer(modifier = Modifier.width(4.dp))
            NuntiumText(
                text = "Try again", modifier = Modifier, style = TextStyle(
                    color = NuntiumTheme.colors.blackPrimary,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            )
        }
    }
}