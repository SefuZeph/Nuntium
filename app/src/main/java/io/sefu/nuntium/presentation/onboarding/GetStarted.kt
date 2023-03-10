package io.sefu.nuntium.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import io.sefu.nuntium.composable.NuntiumButton
import io.sefu.nuntium.designsystem.NuntiumTheme
import io.sefu.nuntium.R
import io.sefu.nuntium.navigation.Screens

@Composable
fun GetStarted(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.getstarted),
            contentDescription = "get started",
            modifier = Modifier.padding(top = 128.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Nuntium",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = NuntiumTheme.typography.h3.copy(
                    fontWeight = FontWeight.Black, color = NuntiumTheme.colors.blackPrimary
                )
            )
            Spacer(modifier = Modifier.height(18.dp))
            Text(
                text = "All news in one place, be the first to know last news",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 80.dp),
                textAlign = TextAlign.Center,
                style = NuntiumTheme.typography.h5.copy(
                    fontWeight = FontWeight.Normal,
                    color = NuntiumTheme.colors.greyPrimary,
                    fontSize = 16.sp
                )
            )
            Spacer(modifier = Modifier.height(64.dp))

            NuntiumButton(modifier = Modifier.padding(16.dp), textValue = "Get Started", onClick = {
                navController.navigate(Screens.LoginScreen.routes)
            })
        }
    }
}