@file:OptIn(ExperimentalMaterial3Api::class)

package com.yogahindu4011.presentation.menu_latihanYoga.latihanView

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yogahindu4011.data.gerakan
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.VideoPlayer
import com.yogahindu4011.presentation.common.DialogTopBar
import com.yogahindu4011.presentation.common.konfirmasiDialog
import com.yogahindu4011.presentation.common.longButton
import com.yogahindu4011.presentation.menu_latihanYoga.components.judulLatihan
import com.yogahindu4011.presentation.menu_latihanYoga.components.listGerakan

@Composable
fun LatihanScreen(
    navController: NavController
) {
    val isDialog = remember { mutableStateOf(false) }

    if (isDialog.value){
        konfirmasiDialog(
            openDialog = isDialog,
            onConfirmation = {
                isDialog.value = false
                navController.navigate(route = Screen.FinishLatihan.route) },
            dialogTitle = "SELESAI LATIHAN?"
        )
    }

    Scaffold(
        topBar = {
            DialogTopBar( text = "Latihan",navController = navController)
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .padding(it)
                .then(
                    Modifier
                        .padding(start = 24.dp, end = 14.dp)
                )
        ) {
            item {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = MaterialTheme.colorScheme.background)
                        .padding(top = 10.dp, bottom = 20.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    horizontalAlignment = Alignment.Start,
                ){
                    VideoPlayer("E_8LHkn4g-Q", LocalLifecycleOwner.current)

                    judulLatihan("Surya Namaskara","Beginer", "Pelajari Gerakan Yoga Surya Namaskara bagi pemula ", modifier = Modifier .padding(top = 10.dp, bottom = 10.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = MaterialTheme.colorScheme.secondary)
                            .padding(start = 25.dp)
                    ) {
                        Text(
                            text = "Daftar Gerakan",
                            style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold),
                            color = MaterialTheme.colorScheme.onSecondary,
                        )
                    }
                }
            }
            items(gerakan){
                listGerakan(gerakan = it)
            }
            item {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 25.dp, bottom = 20.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    horizontalAlignment = Alignment.Start
                ){
                    longButton("SELESAI", onClick = {isDialog.value = true})
                }
            }
        }
    }
}

@Composable
fun itemGerakan(){
    LazyColumn {
        items(gerakan){
            listGerakan(gerakan = it)
        }
    }
}

/*Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .padding(start = 24.dp, end = 14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            VideoPlayer("E_8LHkn4g-Q", LocalLifecycleOwner.current)

            judulLatihan(
                "Surya Namaskara",
                "Beginer",
                "Pelajari Gerakan Yoga Surya Namaskara bagi pemula ",
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondary)
                    .padding(start = 25.dp)
            ) {
                Text(
                    text = "Daftar Gerakan",
                    style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold),
                    color = MaterialTheme.colorScheme.onSecondary,
                )
            }
            LazyColumn(
                modifier = Modifier
                    .padding(it)
            ) {
                items(gerakan){
                    listGerakan(gerakan = it)
                }
            }

            longButton("SELESAI", onClick = {})
        }*/
