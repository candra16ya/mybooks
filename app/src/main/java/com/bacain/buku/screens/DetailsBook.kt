package com.bacain.buku.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.bacain.buku.data.BookRepository
import com.bacain.buku.ui.theme.Shapes
import com.bacain.buku.ui.theme.lexend

//@Composable
//fun DetailsBookScreen(){
//}
@Composable
fun DetailsBookScreen(navController: NavController, books: String?) {

    val synopsis = "Synopsis"

    val book = books?.let { it1 -> BookRepository.findBook(it1) }

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        Card(
            modifier = Modifier
                .width(382.dp)
                .height(522.dp)
                .padding(vertical = 20.dp, horizontal = 15.dp),
            shape = Shapes.large,
            elevation = 15.dp,
            border = BorderStroke(2.dp, Color(0xff757373)),
            backgroundColor = MaterialTheme.colors.onSurface
        ) {
            if (book != null) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(book.imageUrl)
                        .crossfade(true)
                        .build(),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    filterQuality = FilterQuality.High
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 15.dp)
        ) {
            Text(
                text = synopsis,
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colors.primaryVariant,
            )

            if (book != null) {
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = book.synopsis,
                    fontFamily = lexend,
                    fontSize = 14.sp
                )
            }
        }
    }
}
    @Preview(
        showBackground = true,
        device = Devices.PIXEL_2_XL,
    )
    @Composable
    fun DetailsBookPreview() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
        }
    }