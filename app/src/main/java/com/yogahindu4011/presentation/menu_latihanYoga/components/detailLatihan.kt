@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.yogahindu4011.presentation.menu_latihanYoga.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.R
import com.yogahindu4011.presentation.common.MenuTopBar
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun detailLatihan(
    img: Int,
    title: String,
    how: String,
    tips: String,
    navController: NavController
) {
    Scaffold(
        topBar = {
            MenuTopBar(
                text = "Detail gerakan",
                navController = navController
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .fillMaxSize()
                .padding(it)
                .then(
                    Modifier
                        .padding(top = 10.dp,)
                )
        ){
            item {
                Column (
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    horizontalAlignment = Alignment.Start,
                ){
                    Image(
                        painter = painterResource(id = img),
                        contentDescription = null,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )

                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)

                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = MaterialTheme.colorScheme.secondary)
                            .padding(start = 25.dp)
                    ) {
                        Text(
                            text = "Cara Melakukan Gerakan",
                            style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold),
                            color = MaterialTheme.colorScheme.onSecondary
                        )
                    }

                    Text(
                        text = how,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .align(Alignment.CenterHorizontally)
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = MaterialTheme.colorScheme.secondary)
                            .padding(start = 25.dp)
                    ) {
                        Text(
                            text = "TIPS",
                            style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold),
                            color = MaterialTheme.colorScheme.onSecondary
                        )
                    }

                    Text(
                        text = tips,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun previewDetailGerakan(){
    YogaHinduTheme {
        detailLatihan(
            img = R.drawable.ic_general_header,
            title = "Pose A",
            how = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer pellentesque mi at elit malesuada scelerisque. Morbi et dui ac tellus pellentesque imperdiet sed semper arcu. Praesent et odio pulvinar, ultricies magna sed, auctor ipsum. Donec tempus id nisl vitae mattis.",
            tips = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer pellentesque mi at elit malesuada scelerisque. Morbi et dui ac tellus pellentesque imperdiet sed semper arcu. Praesent et odio pulvinar, ultricies magna sed, auctor ipsum. Donec tempus id nisl vitae mattis.",
            navController = rememberNavController()
        )
    }
}
