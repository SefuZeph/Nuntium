package io.sefu.nuntium.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.sefu.nuntium.presentation.SplashScreen
import io.sefu.nuntium.presentation.authentication.*
import io.sefu.nuntium.presentation.onboarding.GetStarted
import io.sefu.nuntium.presentation.onboarding.Onboarding
import io.sefu.nuntium.presentation.topics.TopicScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.Splash.routes) {

        composable(route = Screens.Splash.routes) {
            SplashScreen(navController = navController)
        }

        composable(route = Screens.OnBoarding.routes) {
            Onboarding(navController = navController)
        }

        composable(route = Screens.GetStartedScreen.routes) {
            GetStarted(navController = navController)
        }

        composable(route = Screens.LoginScreen.routes) {
            LoginScreen(navController = navController)
        }
        composable(route = Screens.ForgotPasswordScreen.routes) {
            ForgotPasswordScreen(navController = navController)
        }
        composable(route = Screens.OTPScreen.routes) {
            OTPScreen(navController = navController)
        }

        composable(route = Screens.NewPasswordScreen.routes) {
            NewPasswordScreen(navController = navController)
        }

        composable(route = Screens.SignUpScreen.routes) {
            SignUpScreen(navController = navController)
        }

        composable(route = Screens.TopicScreen.routes) {
            TopicScreen(navController = navController)
        }
    }

}