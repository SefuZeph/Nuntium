package io.sefu.nuntium.presentation.authentication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import io.sefu.nuntium.composable.HeaderDescriptionTopBar
import io.sefu.nuntium.composable.NuntiumButton
import io.sefu.nuntium.composable.NuntiumText
import io.sefu.nuntium.designsystem.NuntiumTheme
import io.sefu.nuntium.navigation.Screens

@Composable
fun OTPScreen(navController: NavController) {
    var otpValue by remember {
        mutableStateOf("")
    }
    HeaderDescriptionTopBar(
        header = "Verification Code ✅",
        description = "You need to enter 4-digit code we send to your email adress."
    ) {
        LazyColumn(content = {
            item {
                Spacer(modifier = Modifier.height(32.dp))

                OtpTextField(otpText = otpValue, onOtpTextChange = { value, otpInputFilled ->
                    otpValue = value
                }, modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(24.dp))

                NuntiumButton(modifier = Modifier.fillMaxWidth(), textValue = "Confirm") {
                    navController.navigate(Screens.NewPasswordScreen.routes)
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

@Composable
fun OtpTextField(
    modifier: Modifier = Modifier,
    otpText: String,
    otpCount: Int = 6,
    onOtpTextChange: (String, Boolean) -> Unit
) {
    BasicTextField(modifier = modifier,
        value = otpText,
        onValueChange = {
            if (it.length <= otpCount) {
                onOtpTextChange.invoke(it, it.length == otpCount)
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
        decorationBox = {
            Row(horizontalArrangement = Arrangement.Center) {
                repeat(otpCount) { index ->
                    CharView(
                        index = index, text = otpText
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        })
}

@Composable
private fun CharView(
    index: Int, text: String
) {
    val isFocused = text.length == index
    val char = when {
        index == text.length -> ""
        index > text.length -> ""
        else -> text[index].toString()
    }
    Text(
        modifier = Modifier
            .width(40.dp)
            .border(
                1.dp, when {
                    isFocused -> NuntiumTheme.colors.primaryPurple
                    else -> NuntiumTheme.colors.greyLighter
                }, RoundedCornerShape(8.dp)
            )
            .background(
                color = if (isFocused) NuntiumTheme.colors.greyLighter else NuntiumTheme.colors.white,
                RoundedCornerShape(8.dp)
            )
            .padding(2.dp),
        text = char,
        style = MaterialTheme.typography.h4,
        color = if (isFocused) {
            NuntiumTheme.colors.primaryPurple
        } else {
            NuntiumTheme.colors.blackPrimary
        },
        textAlign = TextAlign.Center
    )
}