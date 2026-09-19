package com.example.project.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextInput( inputText: String,enabled: Boolean=true,modifier: Modifier = Modifier) {
    OutlinedTextField(
        value ="",
        onValueChange = {},
        enabled =enabled,
        placeholder =
            {
                Text(
                    text=inputText,
                    lineHeight = 20.sp,
                    modifier = modifier
                        .height(20.dp)
                )
            },


        modifier = modifier
            .background(Color.White)
            .width(335.dp)
            .height(48.dp)
    )
}

@Preview
@Composable
private fun TextInputPrew() {

}