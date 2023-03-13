package io.sefu.nuntium.presentation.authentication

import android.widget.ImageView
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.emoji2.widget.EmojiTextView
import androidx.navigation.NavController
import io.sefu.nuntium.R
import io.sefu.nuntium.composable.HeaderDescriptionTopBar
import io.sefu.nuntium.composable.NuntiumEditText

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
                    imagePlaceHolder = R.drawable.email
                )
            }
        })
    }
}