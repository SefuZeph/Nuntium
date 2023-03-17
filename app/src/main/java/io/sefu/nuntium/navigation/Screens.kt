package io.sefu.nuntium.navigation

sealed class Screens(val routes: String) {
    object Splash : Screens("SplashScreen")
    object OnBoarding : Screens("OnBoarding")
    object GetStartedScreen : Screens("GetStartedScreen")
    object LoginScreen : Screens("LoginScreen")
    object ForgotPasswordScreen:Screens("forgotPasswordScreen")
    object OTPScreen:Screens("otpScreen")
}
