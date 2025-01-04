package com.example.logisticsapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavHostController
import com.example.logisticsapp.R

@Composable
fun SplashScreen(navController: NavHostController) {
    Image(
        painter = painterResource(id = R.drawable.splash),
        contentDescription = "Splash Screen Image", // Improved accessibility with description
        modifier = Modifier.fillMaxSize(), // Ensures the image fills the entire screen
        contentScale = ContentScale.Crop // Crops the image to fit the screen while maintaining aspect ratio
    )

    // Example: Add a timer or logic to navigate to the next screen after a delay
    androidx.compose.runtime.LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(3000) // 3-second delay
        navController.navigate("login") { // Replace "home" with your desired route
            popUpTo("splash") { inclusive = true } // Remove splash from the backstack
        }
    }
}
