package io.sefu.nuntium.presentation.authentication

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import io.sefu.nuntium.composable.HeaderDescriptionTopBar

@Composable
fun LoginScreen(navController: NavController) {
    HeaderDescriptionTopBar(
        header = "Welcome Back \uD83D\uDC4B",
        description = "I am happy to see you again. You can continue where you left off by logging in"
    ) {

    }
}