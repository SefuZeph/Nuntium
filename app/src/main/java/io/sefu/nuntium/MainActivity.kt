package io.sefu.nuntium


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.sefu.nuntium.designsystem.NuntiumTheme
import io.sefu.nuntium.navigation.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NuntiumTheme {
                Navigation()
            }
        }
    }
}