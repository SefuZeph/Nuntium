package io.sefu.nuntium.navigation

sealed class Screens(val routes:String) {
    object Splash:Screens("SplashScreen")
    object OnBoarding:Screens("OnBoarding")
}
