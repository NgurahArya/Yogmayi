@file:OptIn(ExperimentalMaterial3Api::class)

package com.yogahindu4011.presentation.menu_mainMenu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yogahindu4011.presentation.common.MainAppTopBar
import com.yogahindu4011.presentation.common.NameDialog
import com.yogahindu4011.presentation.common.NameDialogAfter
import com.yogahindu4011.presentation.menu_mainMenu.components.Greetings
import com.yogahindu4011.presentation.menu_mainMenu.components.MenuBelajarYoga
import com.yogahindu4011.presentation.menu_mainMenu.components.MenuLatihanYoga
import com.yogahindu4011.presentation.menu_mainMenu.components.MenuProgramPilihan
import com.yogahindu4011.presentation.menu_mainMenu.components.MenuTargetMingguan
import com.yogahindu4011.presentation.menu_mainMenu.components.MenuTotalLatihan
import com.yogahindu4011.viewModel.YogaViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainMenuPage(
    navController: NavController,
    viewModel: YogaViewModel

) {
    val openDialog = remember { mutableStateOf(false) }
    val openNameDialog = remember { mutableStateOf(false) }


    val name = viewModel.nameFlow.collectAsState(0)

    if (name.value == null || openNameDialog.value /*|| name.value == ""*/){
        NameDialog(
            saveName = viewModel::saveName,
            currentName = name as State<String>,
            openName = openNameDialog
        )
    }

    if (openDialog.value){
        NameDialogAfter(
            saveName = viewModel::saveName,
            currentName = name as State<String>,
            openName = openDialog
        )
    }

    Scaffold(
        topBar = {
            MainAppTopBar()
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .padding(it)
                .then(
                    Modifier
                        .padding(start = 24.dp, end = 14.dp)
                ),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            Greetings(
                name = if(name.value == null )
                    "Selamat Datang"
                else {
                    "Selamat Datang ${name.value}"
                },
                onTitleClick = {openDialog.value = true}
            )

            MenuBelajarYoga(navController = navController)
            MenuLatihanYoga(navController = navController)
            MenuProgramPilihan()
            MenuTargetMingguan(navController = navController)
            MenuTotalLatihan()
        }
    }
}

/*
@Composable
@Preview
fun Preview(){
    YogaHinduTheme {  MainMenuPage(navController = rememberNavController()) }

}*/
