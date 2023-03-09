package io.sefu.nuntium


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.sefu.nuntium.navigation.Navigation
import io.sefu.nuntium.ui.theme.NuntiumDesignSystemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NuntiumDesignSystemTheme {
                Navigation()
            }
        }
    }
}