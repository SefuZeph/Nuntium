package io.sefu.nuntium.presentation.authentication

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
                    ), modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.End
                )

                Spacer(modifier = Modifier.height(24.dp))

                NuntiumButton(modifier = Modifier.fillMaxWidth(), textValue = "Sign In") {

                }
            }
            item {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.weight(1.0f))
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
                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        NuntiumText(
                            text = "Don't have an account?", modifier = Modifier, style = TextStyle(
                                color = NuntiumTheme.colors.greyPrimary,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp
                            )
                        )
                        NuntiumText(
                            text = "Sign Up", modifier = Modifier, style = TextStyle(
                                color = NuntiumTheme.colors.greyPrimary,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp
                            )
                        )
                    }
                }
            }
        })
    }
}