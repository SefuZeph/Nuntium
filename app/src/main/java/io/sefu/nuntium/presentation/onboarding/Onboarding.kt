package io.sefu.nuntium.presentation.onboarding

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.util.lerp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import io.sefu.nuntium.R
import io.sefu.nuntium.composable.NuntiumButton
import io.sefu.nuntium.designsystem.NuntiumTheme
import kotlin.math.absoluteValue

data class OnboardingData(val pageImage: Int, val name: String, val description: String)

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Onboarding(navController: NavController) {
    val onboardingPage = mutableListOf(
        OnboardingData(
            pageImage = R.drawable.page_one,
            name = "First to Know",
            description = "All news in one place, be the first to know last news"
        ), OnboardingData(
            pageImage = R.drawable.page_one,
            "What to Know",
            "All news in one place, be the first to know last news"
        ), OnboardingData(
            pageImage = R.drawable.page_one,
            "Why to Know",
            "All news in one place, be the first to know last news"
        )
    )

    val pagerState = rememberPagerState()

    var pageIndex = 0

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
    ) {

        HorizontalPager(
            count = onboardingPage.size,
            state = pagerState,
            modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(horizontal = 32.dp),
        ) { pager ->
            pageIndex = pager
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    Modifier
                        .graphicsLayer {
                            val pageOffset = calculateCurrentOffsetForPage(pager).absoluteValue
                            // We animate the scaleX + scaleY, between 85% and 100%
                            lerp(
                                start = 0.85f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            ).also { scale ->
                                scaleX = scale
                                scaleY = scale
                            }

                            // We animate the alpha, between 50% and 100%
                            alpha = lerp(
                                start = 0.5f, stop = 1f, fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            )

                        }
                        .padding(top = 32.dp), shape = NuntiumTheme.shapes.medium) {
                    Image(
                        painter = painterResource(id = onboardingPage[pager].pageImage),
                        contentDescription = "Image"
                    )
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PagerIndicator(onboardingPage.size, pagerState.currentPage)

            Text(
                text = onboardingPage[pageIndex].name,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = NuntiumTheme.typography.h3.copy(
                    fontWeight = FontWeight.SemiBold, color = NuntiumTheme.colors.blackPrimary
                )
            )
            Spacer(modifier = Modifier.height(18.dp))
            Text(
                text = onboardingPage[pageIndex].description,
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

            NuntiumButton(
                modifier = Modifier.padding(16.dp), textValue = "Next"
            )
        }
    }
}

@Composable
fun PagerIndicator(
    size: Int, currentPage: Int
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(top = 60.dp)
    ) {
        repeat(size) {
            Indicator(isSelected = it == currentPage)
        }
    }
}

@Composable
fun Indicator(isSelected: Boolean) {
    val width = animateDpAsState(targetValue = if (isSelected) 25.dp else 10.dp)

    Box(
        modifier = Modifier
            .padding(1.dp)
            .height(10.dp)
            .width(width.value)
            .clip(CircleShape)
            .background(
                color = if (isSelected) NuntiumTheme.colors.primaryPurple else NuntiumTheme.colors.greyLighter
            )
    )
}