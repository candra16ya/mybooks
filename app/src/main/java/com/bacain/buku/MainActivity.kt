package com.bacain.buku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bacain.buku.components.LazyVerticalGridScreen
import com.bacain.buku.components.SearchBar
import com.bacain.buku.data.BookItems
import com.bacain.buku.screen.DetailsBook
import com.bacain.buku.ui.theme.BukuTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BukuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun MainScreen() {

    val navControllerr = rememberNavController()
    val startDestination: String = "book_grid_item"

    NavHost(navControllerr, startDestination) {
        composable("book_grid_item") {
            LazyVerticalGridScreen(navControllerr)
            SearchBar()
        }
        composable("details_book"){
            DetailsBook(
                bookItems = BookItems(
                    "",
                    "",
                    "https://covers.openlibrary.org/b/id/12833521-M.jpg",
                    "The Subtle Art of Not Giving a Fuck argues that individuals " +
                    "should seek to find meaning through what they find to be important" +
                    " and only engage in values that they can control. Values " +
                    "(such as popularity) that are not under a person's control, " +
                    "are, according to the book, 'bad values'."))
        }

    }
}