package io.sefu.nuntium.presentation.topics

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.sefu.nuntium.composable.HeaderDescriptionTopBar
import io.sefu.nuntium.composable.NuntiumButton
import io.sefu.nuntium.composable.NuntiumTopicCard
import io.sefu.nuntium.navigation.Screens

data class TopicSelection(val index: Int, val value: String, val isSelected: Boolean)

@Composable
fun TopicScreen(navController: NavController) {

    var topicList by remember {
        mutableStateOf(
            mutableListOf(
                TopicSelection(0, "\uD83C\uDFC8  Sports", false),
                TopicSelection(1, "⚖️ Politics", false),
                TopicSelection(2, "\uD83C\uDF1E  Life", false),
                TopicSelection(3, "\uD83C\uDFAE  Gaming", false),
                TopicSelection(4, "\uD83D\uDC3B  Animals", false),
                TopicSelection(5, "\uD83C\uDF34  Nature", false),
                TopicSelection(6, "\uD83C\uDF54  Food", false),
                TopicSelection(7, "\uD83C\uDFA8  Art", false),
                TopicSelection(8, "\uD83D\uDCDC  History", false),
                TopicSelection(9, "\uD83D\uDC57  Fashion", false)
            )
        )
    }
    val selectedItems = remember { mutableSetOf<Int>() }

    fun toggleSelection(index: Int) {
        if (selectedItems.contains(index)) {
            selectedItems.remove(index)
        } else {
            selectedItems.add(index)
        }
    }
//    val selectedItems = remember { mutableSetOf<Int>() }
//
//    fun toggleSelection(index: Int) {
//        if (selectedItems.contains(index)) {
//            selectedItems.remove(index)
//        } else {
//            selectedItems.add(index)
//        }
//    }

    HeaderDescriptionTopBar(
        header = "Select your favorite topics",
        description = "Select some of your favorite topics to let us suggest better news for you."
    ) {
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(top = 32.dp),
            content = {
                items(topicList.size) {
                    NuntiumTopicCard(
                        topicName = topicList[it].value,
                        modifier = Modifier
                            .padding(4.dp)
                            .clickable {
                                topicList = topicList
                                    .mapIndexed { index, topicSelection ->
                                        if (it == index) {
                                            topicSelection.copy(isSelected = !topicSelection.isSelected)
                                        } else {
                                            topicSelection
                                        }
                                    }
                                    .toMutableList()
                            },
                        isSelected = topicList[it].isSelected
                    )
                }
            })

        NuntiumButton(
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.BottomCenter),
            textValue = "Next"
        ) {

        }
    }
}