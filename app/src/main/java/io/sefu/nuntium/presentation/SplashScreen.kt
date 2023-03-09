package io.sefu.nuntium.presentation

import android.os.CountDownTimer
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import app.rive.runtime.kotlin.RiveAnimationView
import io.sefu.nuntium.R
import io.sefu.nuntium.designsystem.NuntiumTheme
import io.sefu.nuntium.navigation.Screens

@Composable
fun SplashScreen(navController: NavController) {

    LaunchedEffect(key1 = Unit, block = {
        val timer = object : CountDownTimer(2000, 500) {
            override fun onTick(millisUntilFinished: Long) {
                Log.d("SplashTikTok", "${millisUntilFinished}")
            }

            override fun onFinish() {
                navController.navigate(Screens.OnBoarding.routes)
            }
        }
        timer.start()
    })

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

        Image(
            painter = painterResource(id = R.drawable.logo_text),
            contentDescription = "Logo text",
            modifier = Modifier.padding(top = 96.dp)
        )

    }
}