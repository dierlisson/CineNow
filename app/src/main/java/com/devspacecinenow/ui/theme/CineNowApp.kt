package com.devspacecinenow.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.devspacecinenow.MovieListScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.devspacecinenow.MovieDetailScreen


@Composable
fun CineNowApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "movieList") {
       composable(route = "movieList"){
           MovieListScreen(navController)
       }
       composable(route = "movieDetail"){
            MovieDetailScreen()
       }
    }
}