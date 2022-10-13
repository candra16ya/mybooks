package com.bacain.buku.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bacain.buku.ui.theme.Shapes
import com.bacain.buku.ui.theme.text

@Preview(showBackground = true)
@Composable
fun SearchBarPreview() {
    SearchBar()
}

@Composable
fun SearchBar(
    placeText: String = "Search book here..",
) {
    var textValue by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 10.dp,
                top = 15.dp,
                end = 10.dp
            ),
        contentAlignment = Alignment.TopCenter
    ) {

        TextField(
            value = textValue,
            onValueChange = { textValue = it },
            modifier = Modifier
                .widthIn(370.dp)
                .heightIn(50.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                backgroundColor = MaterialTheme.colors.onSurface
            ),
            maxLines = 1,
            shape = Shapes.large,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null,
                    tint = Color.Black
                )
            },
            placeholder = {
                Text(text = placeText, color = text)
            }
        )
    }
}