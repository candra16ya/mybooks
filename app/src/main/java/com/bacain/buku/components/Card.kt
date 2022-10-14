package com.bacain.buku.components

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.bacain.buku.data.BookItems
import com.bacain.buku.data.BookItemsInfo
import com.bacain.buku.ui.theme.Shapes

@Composable
fun LazyVerticalGridScreen() {
    val list = BookItemsInfo().bookInfo()

    val title = "My books"
    Text(
        text = title, style = MaterialTheme.typography.h4,
        modifier = Modifier.padding(vertical = 100.dp, horizontal = 30.dp)
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(27.dp),
        modifier = Modifier.padding(
            top = 137.dp,
        ),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        content = {
            items(list.size){ index ->
                GridItem(bookItems = list[index])
            }
        }
    )
}

@Composable
private fun GridItem(bookItems: BookItems) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(216.dp)
            .clickable {
                Toast.makeText(context,"Item Selected",Toast.LENGTH_SHORT).show()
            },
        backgroundColor = MaterialTheme.colors.onSurface,
        shape = Shapes.large,

        ) {

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(bookItems.imageUrl)
                .crossfade(true)
                .build(),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.padding(bottom = 50.dp),
            filterQuality = FilterQuality.High
        )
        Card(
            modifier = Modifier.padding(top = 166.dp),
            backgroundColor = MaterialTheme.colors.surface
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize().padding(vertical = 5.dp, horizontal = 10.dp),
            ) {
                Text(
                    text = bookItems.title,
                    color = MaterialTheme.colors.primaryVariant,
                    style = MaterialTheme.typography.subtitle1,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = bookItems.author,
                    color = MaterialTheme.colors.primaryVariant,
                    style = MaterialTheme.typography.subtitle2,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}