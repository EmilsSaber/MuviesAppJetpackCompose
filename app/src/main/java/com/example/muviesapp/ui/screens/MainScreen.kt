package com.example.muviesapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.muviesapp.ui.bottomnav.BottomNavigationView
import com.example.muviesapp.ui.navigation.Screens

@SuppressLint("UnusedMaterialScaffoldPagingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        bottomBar = { BottomNavigationView(navController = navController)}
    ){
    
    }

    }


@Preview
@Composable
fun MainScreenPreview() {
    val navController = rememberNavController()
    MainScreen(navController)
}