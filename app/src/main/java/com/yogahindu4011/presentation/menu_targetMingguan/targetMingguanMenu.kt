package com.yogahindu4011.presentation.menu_targetMingguan

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yogahindu4011.ui.theme.YogaHinduTheme
import com.yogahindu4011.presentation.common.MenuTopBar
import com.yogahindu4011.presentation.common.shortButton
import com.yogahindu4011.presentation.menu_targetMingguan.components.targetCounter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun targetMinggaun(modifier: Modifier = Modifier){
    Scaffold(
        topBar = {
            MenuTopBar(
                text = "Target Mingguan"
            )
        }
    ) {
        Column(
            modifier = Modifier
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
                text = "Direkomendasikan untuk melakukan latihan yoga minimum 3 kali dalam seminggu untuk mendapatkan hasil yang maksimal.",
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
                    onClick = {}
                )
            }
        }
    }
}

@Composable
@Preview
fun Preveww(){
    YogaHinduTheme {
        targetMinggaun()
    }

}