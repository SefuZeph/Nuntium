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
fun LoginScreen(navController: NavController) {
    HeaderDescriptionTopBar(
        header = "Welcome Back \uD83D\uDC4B",
        description = "I am happy to see you again. You can continue where you left off by logging in"
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

                Spacer(modifier = Modifier.height(16.dp))

                NuntiumEditText(
                    modifier = Modifier.fillMaxWidth(),
                    "Password",
                    imagePlaceHolder = R.drawable.password_inac,
                    iconHeight = 20.dp,
                    iconWidth = 16.dp
                )
                Spacer(modifier = Modifier.height(16.dp))
                NuntiumText(
                    text = "Forgot Password?", style = NuntiumTheme.typography.h6.copy(
                        color = NuntiumTheme.colors.greyPrimary
                    ), modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate(Screens.ForgotPasswordScreen.routes)
                        }, textAlign = TextAlign.End
                )

                Spacer(modifier = Modifier.height(24.dp))

                NuntiumButton(modifier = Modifier.fillMaxWidth(), textValue = "Sign In") {
                    navController.navigate(Screens.TopicScreen.routes)
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    Spacer(modifier = Modifier.height(24.dp))
                    NuntiumText(
                        text = "or", modifier = Modifier.fillMaxWidth(), style = TextStyle(
                            color = NuntiumTheme.colors.greyPrimary,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp
                        )
                    )
                    Spacer(modifier = Modifier.height(24.dp))

                    NuntiumSocialButton(
                        onClick = {},
                        socialIcon = R.drawable.google_logo,
                        textValue = "Sign In with Google"
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    NuntiumSocialButton(
                        onClick = {},
                        socialIcon = R.drawable.facebook_logo,
                        textValue = "Sign In with Facebook"
                    )

                }
            }
        })

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.BottomCenter)
                .clickable {
                    navController.navigate(Screens.SignUpScreen.routes)
                },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            NuntiumText(
                text = "Don't have an account?", modifier = Modifier, style = TextStyle(
                    color = NuntiumTheme.colors.greyPrimary,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            )
            Spacer(modifier = Modifier.width(4.dp))
            NuntiumText(
                text = "Sign Up", modifier = Modifier, style = TextStyle(
                    color = NuntiumTheme.colors.blackPrimary,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            )
        }
    }
}