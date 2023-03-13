package io.sefu.nuntium.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.sefu.nuntium.designsystem.NuntiumTheme

@Composable
fun NuntiumEditText(modifier: Modifier, placeHolder: String = "", imagePlaceHolder: Int) {
    var editTextValue by remember {
        mutableStateOf("")
    }

    BasicTextField(
        value = editTextValue,
        onValueChange = { value ->
            editTextValue = value
        },
        modifier = modifier
            .height(56.dp)
            .background(color = NuntiumTheme.colors.greyLighter, shape = RoundedCornerShape(12.dp)),
        singleLine = true,
        decorationBox = { innerTextField ->
            Row(
                Modifier
                    .background(
                        NuntiumTheme.colors.greyLighter, RoundedCornerShape(12.dp)
                    )
                    .padding(16.dp), verticalAlignment = Alignment.CenterVertically
            ) {

                if (editTextValue.isEmpty()) {
                    Image(
                        painter = painterResource(id = imagePlaceHolder),
                        contentDescription = "edittext icon",
                        modifier = Modifier
                            .width(20.dp)
                            .height(16.dp)
                    )
                    Spacer(modifier = Modifier.width(24.dp))
                    NuntiumText(
                        placeHolder, style = NuntiumTheme.typography.h5.copy(
                            fontSize = 16.sp,
                            color = NuntiumTheme.colors.greyPrimary,
                            fontWeight = FontWeight.Normal
                        )
                    )
                }
                innerTextField()  //<-- Add this
            }
        },
        textStyle = NuntiumTheme.typography.h5.copy(
            fontSize = 16.sp,
            color = NuntiumTheme.colors.blackPrimary,
            fontWeight = FontWeight.Normal
        ),
    )
}