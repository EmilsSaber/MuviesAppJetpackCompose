package com.example.muviesapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.muviesapp.ui.screens.MainScreen
import com.example.muviesapp.ui.screens.SecondScreen

sealed class Screens(val route: String) {
    object MainScreen : Screens("mainScreen")
    object SecondScreen : Screens( "secondScreen")
}


@Composable
fun NavHost(
    navController: NavHostController
) {
   androidx.navigation.compose.NavHost(
       navController = navController,
       startDestination = Screens.MainScreen.route)
   {
        composable(Screens.MainScreen.route) {
            MainScreen(navController)
        }
       composable(Screens.SecondScreen.route){
           SecondScreen()
       }
    }
}