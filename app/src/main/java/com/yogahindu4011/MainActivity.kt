package com.yogahindu4011

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.data.GerakanYoga
import com.yogahindu4011.navigation.navGraph.SetupNavGraph
import com.yogahindu4011.ui.theme.YogaHinduTheme
import com.yogahindu4011.viewModel.YogaViewModel
import com.yogahindu4011.viewModel.YogaViewModelFactory

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    private lateinit var yogaViewModel: YogaViewModel

    private val Context.datastore: DataStore<Preferences> by preferencesDataStore(name = "settings")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        yogaViewModel = YogaViewModelFactory(datastore).create(YogaViewModel::class.java)
        setContent {
            YogaHinduTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController, viewModel = yogaViewModel)
            }
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    YogaHinduTheme {
        MainMenuPage(navController = rememberNavController())
    }
}*/
