package com.yogahindu4011.presentation.menu_belajarYoga.materiView.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.R
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun listYoga(){

    Text(
        text = "1. Jnana Yoga (Penyatuan melalui Ilmu Pengetahuan)",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground,
    )
    Text(
        text = "2. Karma Yoga (Penyatuan melalui Pelayanan Sosial terhadap sesama umat manusia)",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground,
    )
    Text(
        text = "3. Bhakti Yoga (Penyatuan melalui Bakti Kepada Tuhan)",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground,
    )
    Text(
        text = "4. Yantra Yoga (Penyatuan melalui Pembuatan Visual)",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground,
    )
    Text(
        text = "5. Tantra Yoga (Penyatuan melalui Pembangkitan Chakra)",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground,
    )
    Text(
        text = "6. Mantra Yoga (Penyatuan melalui Suara dan Bunyi)",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground,
    )
    Text(
        text =  "7. Kundalini Yoga (Penyatuan melalui Pembangkitan Energi Kundalini)",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground,
    )
    Text(
        text = "8. Hatha Yoga (Penyatuan melalui Penguasaan Tubuh dan Nafas)",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground,
    )
    Text(
        text = "9. Raja Yoga (Penyatuan melalui Penguasaan Pikiran dan Mental)",
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MateriItem(
    imageId: Int,
    title: String,
    body: Int,
    body2: Int?,
    navController: NavController
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(
                        text = "Materi Bacaan",
                        style = MaterialTheme.typography.labelLarge,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }){
                        Icon(
                            painter = painterResource(id = R.drawable.icon_chevron_left),
                            contentDescription = "Go Back",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .padding(it)
                .then(
                    Modifier
                        .padding(start = 24.dp, end = 14.dp, bottom = 20.dp)
                )
        ) {
            item {
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    horizontalAlignment = Alignment.Start,
                    ){
                    Image(
                        painter = painterResource(id = imageId),
                        contentDescription = "Article Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .height(250.dp)
                            .fillMaxWidth()
                            .align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 10.dp)
                    )
                    Text(
                        text = stringResource(id = body),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                    )

                }

            }
            item {
                Column(
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .padding(start = 10.dp, top = 5.dp, bottom = 10.dp)
                ){
                    listYoga()
                }
            }
            item {
                Column(
                    verticalArrangement = Arrangement.spacedBy(15.dp),
                    horizontalAlignment = Alignment.Start,
                ){
                    Text(
                        text = stringResource(id = body2!!),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                    )
                }
            }
        }
    }
}



@Composable
@Preview
fun prevMaterii(){
    YogaHinduTheme {
        MateriItem(R.drawable.ic_materi_chandra_header, "Surya Namaskara", R.string.materiYogaP1, R.string.materiYogaP2, rememberNavController())
    }

}