package com.bacain.buku.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
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
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.bacain.buku.data.BookItems
import com.bacain.buku.ui.theme.Shapes
import com.bacain.buku.ui.theme.lexend

//@Composable
//fun DetailsBookScreen(){
//}

@Composable
fun DetailsBook(bookItems: BookItems){
   val synopsis = "Synopsis"

    Box(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())){
        Card(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 20.dp)
                .fillMaxWidth()
                .height(522.dp),
            backgroundColor = Color(0XFFD9D9D9),
            shape = Shapes.large,
            content = {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(
                           bookItems.imageUrl
                        )
                        .crossfade(true)
                        .build(),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    filterQuality = FilterQuality.High
                )
            }
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 559.dp, start = 15.dp)
        ) {
            Text(
                text = synopsis,
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colors.primaryVariant
            )

//            Text(
//                text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
//                fontFamily = lexend,
//                fontSize = 14.sp,
//                color = MaterialTheme.colors.primaryVariant
//            )

            Text(
                text = bookItems.synopsis,
                fontFamily = lexend,
                fontSize = 14.sp
            )
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