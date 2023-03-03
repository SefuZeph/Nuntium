package io.sefu.nuntium.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import app.rive.runtime.kotlin.RiveAnimationView
import io.sefu.nuntium.R
import io.sefu.nuntium.designsystem.NuntiumTheme

@Composable
fun SplashScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = NuntiumTheme.colors.primaryPurple),
        contentAlignment = Alignment.Center
    ) {
        AndroidView(modifier = Modifier.size(48.dp), factory = {
            RiveAnimationView(it).apply {
                setRiveResource(R.raw.logoanim)
            }
        })

        Image(painter = painterResource(id = R.drawable.logo_text), contentDescription = "Logo text", modifier = Modifier.padding(top=96.dp))

    }
}