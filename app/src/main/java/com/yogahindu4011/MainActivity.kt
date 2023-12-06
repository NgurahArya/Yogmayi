package com.yogahindu4011

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.navigation.SetupNavGraph
import com.yogahindu4011.presentation.menu_mainMenu.MainMenuPage
import com.yogahindu4011.ui.theme.YogaHinduTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            YogaHinduTheme {

                navController = rememberNavController()

                SetupNavGraph(navController = navController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    YogaHinduTheme {
        MainMenuPage(navController = rememberNavController())
    }
}