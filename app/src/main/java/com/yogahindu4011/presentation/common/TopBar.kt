package com.yogahindu4011.presentation.common


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yogahindu4011.R
import com.yogahindu4011.ui.theme.YogaHinduTheme
import com.yogahindu4011.ui.theme.md_theme_light_primary

@Composable
fun MainAppTopBar(
    modifier: Modifier = Modifier,
    color: Color = md_theme_light_primary
){
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp)
                .background(color)
                .padding(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 10.dp)
        ){
                Text(
                text = "YOGMAYI",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier
                    .padding(8.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_applogowhite),
                contentDescription = null,
                contentScale = ContentScale.FillHeight
            )

        }
}

@Composable
fun MenuTopBar(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
    text: String,
    navController: NavController
){

    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .background(color)
            .padding(start = 20.dp, top = 16.dp, end = 20.dp, bottom = 16.dp)
    ){

        Icon(
            painter = painterResource(id = R.drawable.icon_chevron_left),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
                .padding(end = 8.dp)
                .fillMaxHeight()
                .clickable {
                    navController.popBackStack()
                }
        )

        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
        )

    }
}

@Composable
fun DialogTopBar(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
    text: String,
    navController: NavController
){

    val isDialog = remember { mutableStateOf(false) }

    if (isDialog.value){
        konfirmasiDialog(
            openDialog = isDialog,
            onConfirmation = {
                isDialog.value = false
                navController.popBackStack() },
            dialogTitle = "BATALKAN LATIHAN?"
        )
    }

    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .background(color)
            .padding(start = 20.dp, top = 16.dp, end = 20.dp, bottom = 16.dp)
    ){

        Icon(
            painter = painterResource(id = R.drawable.icon_chevron_left),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
                .padding(end = 8.dp)
                .fillMaxHeight()
                .clickable {isDialog.value = true}
        )

        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
        )

    }
}


@Composable
@Preview
fun menuTopBarPrev(){
    YogaHinduTheme { MenuTopBar(text = "Sub Menu", navController = rememberNavController()) }

}
