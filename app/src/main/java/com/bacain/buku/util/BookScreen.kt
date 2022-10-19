package com.bacain.buku.util

sealed class BookScreen(val route: String){
    object HomeScreen : BookScreen("home_screen")
    object DetailScreen : BookScreen("detail_screen")
}
