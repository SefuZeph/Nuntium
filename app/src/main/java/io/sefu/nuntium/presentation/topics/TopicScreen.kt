package io.sefu.nuntium.presentation.topics

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.sefu.nuntium.composable.HeaderDescriptionTopBar
import io.sefu.nuntium.composable.NuntiumButton
import io.sefu.nuntium.composable.NuntiumTopicCard
import io.sefu.nuntium.navigation.Screens

@Composable
fun TopicScreen(navController: NavController) {
    val topicList = listOf(
        "\uD83C\uDFC8  Sports",
        "⚖️ Politics",
        "\uD83C\uDF1E  Life",
        "\uD83C\uDFAE  Gaming",
        "\uD83D\uDC3B  Animals",
        "\uD83C\uDF34  Nature",
        "\uD83C\uDF54  Food",
        "\uD83C\uDFA8  Art",
        "\uD83D\uDCDC  History",
        "\uD83D\uDC57  Fashion"


    )
    HeaderDescriptionTopBar(
        header = "Select your favorite topics",
        description = "Select some of your favorite topics to let us suggest better news for you."
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(top = 32.dp),
            content = {
                items(topicList.size) {
                    NuntiumTopicCard(topicName = topicList[it], modifier = Modifier.padding(4.dp))
                }
            })

        NuntiumButton(
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.BottomCenter),
            textValue = "Next"
        ) {
            navController.navigate(Screens.TopicScreen.routes)
        }
    }
}