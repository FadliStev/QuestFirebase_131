package com.example.activity10.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.activity10.ui.view.HomeScreen
import com.example.activity10.ui.view.InsertMhsView

@Composable
fun PengelolaHalaman(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ){
        composable(DestinasiHome.route){
            HomeScreen(navigateToltemEntry = {
                navController.navigate(DestinasiInsert.route)
            })

        }
        composable(DestinasiInsert.route) {
            InsertMhsView(onBack = {
                navController.popBackStack()
            }, onNavigate = {
                navController.navigate(DestinasiHome.route)
            })
        }
    }
}