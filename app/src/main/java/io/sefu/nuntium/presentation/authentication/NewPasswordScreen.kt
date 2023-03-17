package io.sefu.nuntium.presentation.authentication

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import io.sefu.nuntium.R
import io.sefu.nuntium.composable.HeaderDescriptionTopBar
import io.sefu.nuntium.composable.NuntiumButton
import io.sefu.nuntium.composable.NuntiumEditText
import io.sefu.nuntium.composable.NuntiumText
import io.sefu.nuntium.designsystem.NuntiumTheme
import io.sefu.nuntium.navigation.Screens

@Composable
fun NewPasswordScreen(navController: NavController) {
    HeaderDescriptionTopBar(
        header = "Create New Password \uD83D\uDD12",
        description = "You can create a new password, please dont forget it too."
    ) {
        LazyColumn(content = {
            item {
                Spacer(modifier = Modifier.height(32.dp))
                NuntiumEditText(
                    modifier = Modifier.fillMaxWidth(),
                    "New Password",
                    imagePlaceHolder = R.drawable.password_inac,
                    iconHeight = 20.dp,
                    iconWidth = 16.dp
                )
                Spacer(modifier = Modifier.height(16.dp))

                NuntiumEditText(
                    modifier = Modifier.fillMaxWidth(),
                    "Repeat New Password",
                    imagePlaceHolder = R.drawable.password_inac,
                    iconHeight = 20.dp,
                    iconWidth = 16.dp
                )

                Spacer(modifier = Modifier.height(16.dp))

                NuntiumButton(modifier = Modifier.fillMaxWidth(), textValue = "Confirm") {
                    navController.navigate(Screens.OTPScreen.routes)
                }
            }
        })
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.BottomCenter),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            NuntiumText(
                text = "Didn't receive an email?", modifier = Modifier, style = TextStyle(
                    color = NuntiumTheme.colors.greyPrimary,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            )
            Spacer(modifier = Modifier.width(4.dp))
            NuntiumText(
                text = "Send again", modifier = Modifier, style = TextStyle(
                    color = NuntiumTheme.colors.blackPrimary,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            )
        }
    }
}