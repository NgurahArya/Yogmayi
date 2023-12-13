package com.yogahindu4011.presentation.menu_belajarYoga.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
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
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun menuBelajarYogaGeneral(
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = "YOGA SECARA UMUM",
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold),
            color = MaterialTheme.colorScheme.onBackground
        )

        Row (
            horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    navController.navigate(route = Screen.MateriYoga.route)
                }
                .border(width = 1.dp, color = MaterialTheme.colorScheme.outline, shape = RoundedCornerShape(size = 5.dp))
                .height(height = 112.dp)
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
        ){
            Text(
                text = "Yoga",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                modifier = Modifier
                    .padding(start = 12.dp)
            )

            Spacer(modifier = Modifier .weight(1f))

            Image(
                painter = painterResource(id = R.drawable.ic_book),
                contentDescription = "icon menu 1",
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .padding(end = 5.dp)
            )
        }
    }
}

@Composable
fun menuBelajarYogaSurya(
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = "GERAKAN SURYA NAMASKARA",
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold),
            color = MaterialTheme.colorScheme.onBackground
        )

        Row (
            horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    navController.navigate(route = Screen.MateriYoga2.route)
                }
                .border(width = 1.dp, color = MaterialTheme.colorScheme.outline, shape = RoundedCornerShape(size = 5.dp))
                .height(height = 112.dp)
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
        ){
            Text(
                text = "Surya Namaskara",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                modifier = Modifier
                    .padding(start = 12.dp)
            )

            Spacer(modifier = Modifier .weight(1f))

            Image(
                painter = painterResource(id = R.drawable.ic_sun),
                contentDescription = "icon menu 2",
                modifier = Modifier
                    .height(102.dp)
                    .width(100.dp)
                    .padding(end = 5.dp)
            )
        }
    }
}

@Composable
fun menuBelajarYogaChandra(
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = "GERAKAN CHANDRA NAMASKARA",
            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold),
            color = MaterialTheme.colorScheme.onBackground
        )

        Row (
            horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.Start),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    navController.navigate(route = Screen.MateriYoga3.route)
                }
                .border(width = 1.dp, color = MaterialTheme.colorScheme.outline, shape = RoundedCornerShape(size = 5.dp))
                .height(height = 112.dp)
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
        ){
            Text(
                text = "Chandra Namaskara",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                modifier = Modifier
                    .padding(start = 12.dp)
            )

            Spacer(modifier = Modifier .weight(1f))

            Image(
                painter = painterResource(id = R.drawable.ic_moon),
                contentDescription = "icon menu 3",
                modifier = Modifier
                    .height(130.dp)
                    .width(100.dp)
                    .padding(end = 5.dp)
            )
        }
    }
}
@Composable
@Preview
fun MenuBelajarPreview(){
    YogaHinduTheme { menuBelajarYogaGeneral(navController = rememberNavController()) }
}

@Composable
@Preview
fun MenuBelajarPreview2(){
    YogaHinduTheme { menuBelajarYogaSurya(navController = rememberNavController()) }
}

@Composable
@Preview
fun MenuBelajarPreview3(){
    YogaHinduTheme { menuBelajarYogaChandra(navController = rememberNavController()) }
}

