package com.yogahindu4011.presentation.menu_targetMingguan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.presentation.common.MenuTopBar
import com.yogahindu4011.presentation.common.shortButton
import com.yogahindu4011.presentation.common.simpanDialog
import com.yogahindu4011.presentation.menu_targetMingguan.components.targetCounter
import com.yogahindu4011.ui.theme.YogaHinduTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TargetMinggaunMenu(
    navController: NavController
) {
    var openAlertDialog by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            MenuTopBar(
                text = "Target Mingguan",
                navController = navController
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .padding(it)
                .then(
                    Modifier
                        .padding(top = 20.dp, start = 24.dp, end = 14.dp)
                ),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.Start,
            ){
            Text(
                text = "Buat Target Latihan",
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground,
                modifier  = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Direkomendasikan untuk melakukan latihan yoga minimum 3 kali dalam seminggu ",
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight(400)),
                textAlign = TextAlign.Justify,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = "Berapa banyak latihan yoga yang ingin kamu lakukan dalam satu minggu?",
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight(500)),
                textAlign = TextAlign.Justify,
                color = MaterialTheme.colorScheme.primary
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally)
            ){
                targetCounter()
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally)
            ){
                shortButton(
                    text = "SIMPAN",
                    onClick = {
                        //blm rewrite data dan tampilin di main menu
                        openAlertDialog = true
                    }
                )
            }
        }
    }
    if (openAlertDialog){
        simpanDialog(
            onDismissRequest = {openAlertDialog = false},
            onConfirmation = {navController.popBackStack()},
            dialogTitle = "BERHASIL TERSIMPAN",
            dialogText = "Anda akan diarahkan kembali ke Menu Utama",
            navController = navController
        )
    }
}

@Composable
@Preview
fun Preveww(){
    YogaHinduTheme {
        TargetMinggaunMenu(navController = rememberNavController())
    }

}