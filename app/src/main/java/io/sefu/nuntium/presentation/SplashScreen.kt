package io.sefu.nuntium.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
        AndroidView(modifier = Modifier.size(120.dp),factory = { RiveAnimationView(it).apply {
            setRiveResource(R.raw.logoanim)
        } })
    }
}