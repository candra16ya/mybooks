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
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.bacain.buku.screens.HomeScreen
import com.bacain.buku.components.SearchBar
import com.bacain.buku.screens.DetailsBookScreen
import com.bacain.buku.ui.theme.BukuTheme
import com.bacain.buku.util.BookScreen

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
                    Navigation()
                }
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(navController, BookScreen.HomeScreen.route) {
        composable(BookScreen.HomeScreen.route) {
            HomeScreen(navController = navController)
            SearchBar()
        }
        composable(BookScreen.DetailScreen.route +"/{bookItems.title}",
            arguments = listOf(navArgument(name = "bookItems.title"){
                type = NavType.StringType
            })
        ){ entry ->
            DetailsBookScreen(navController = navController,entry.arguments?.getString("bookItems.title") )
        }

    }
}