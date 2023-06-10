package com.example.muviesapp.ui.bottomnav

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.muviesapp.ui.navigation.Screens

@Composable
fun BottomNavigationView(navController: NavController) {
    val navItem = listOf(BottomNavItem.Main, BottomNavItem.Second)
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomNavigation(
        backgroundColor = Color.Red,
        modifier = Modifier.fillMaxWidth()
    ) {
        navItem.forEachIndexed { _, item ->
            BottomNavigationItem(
                icon = { Icon(item.icon, contentDescription = "") },
                label = { Text(text = item.title, color = Color.White) },
                selected = currentRoute == item.navRoute,
                onClick = {
                    navController.navigate(item.navRoute)
                },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Gray

            )
        }
    }
}

sealed class BottomNavItem(
    val icon: ImageVector,
    val title: String,
    val navRoute: String
) {
    object Main : BottomNavItem(Icons.Filled.Home, "Home", navRoute = Screens.MainScreen.route)
    object Second : BottomNavItem(Icons.Filled.Add, "Add", navRoute = Screens.SecondScreen.route)
}