package io.sefu.nuntium.presentation.authentication

import android.widget.ImageView
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.emoji2.widget.EmojiTextView
import androidx.navigation.NavController
import io.sefu.nuntium.composable.HeaderDescriptionTopBar

@Composable
fun LoginScreen(navController: NavController) {
    HeaderDescriptionTopBar(
        header = "Welcome Back \uD83D\uDC4B",
        description = "I am happy to see you again. You can continue where you left off by logging in"
    ) {
        AndroidView(factory = { context ->
            EmojiTextView(context).apply {
                text = "\uD83D\uDE00"
            }
        })
    }
}