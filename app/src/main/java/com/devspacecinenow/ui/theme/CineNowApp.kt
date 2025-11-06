package com.devspacecinenow.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.devspacecinenow.MovieListScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.devspacecinenow.MovieDetailScreen
import androidx.navigation.NavType


@Composable
fun CineNowApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "movieList") {
       composable(route = "movieList"){
           MovieListScreen(navController)
       }
       composable(
           route = "movieDetail"+"/{itemId}",
           arguments = listOf(navArgument("itemId"){
               type = NavType.StringType
           })
       ){backStackEntry->
           val movieId = requireNotNull(backStackEntry.arguments?.getString("itemId"))
            MovieDetailScreen(movieId, navController)
       }
    }
}