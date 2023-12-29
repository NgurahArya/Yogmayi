@file:OptIn(ExperimentalMaterial3Api::class)

package com.yogahindu4011.presentation.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yogahindu4011.R
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.common.longButton

@Composable
fun Onboarding2(
    navController: NavController
){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
                .padding(start = 24.dp, end = 14.dp)
                .wrapContentSize().align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            var textState by remember { mutableStateOf(TextFieldValue("")) }

            Text(
                text = "Masukan Nama Anda",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .padding(bottom = 8.dp)
            )

            TextField(
                modifier = Modifier.fillMaxWidth() .padding(bottom = 5.dp),
                value = textState,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = MaterialTheme.colorScheme.onBackground,
                    MaterialTheme.colorScheme.surface,
                ),
                onValueChange = {newText ->
                    textState = newText
                },
                shape = RoundedCornerShape(size = 10.dp)

            )

            longButton(
                "SELESAI",
                onClick = {navController.navigate(route = Screen.MainMenu.route)},
            )
        }
    }
}


@Composable
fun OnboardingPage(
    navController: NavController
){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
            /*.background(Brush.verticalGradient(colorStops = colorStop))*/
    ){
        Column (
            modifier = Modifier
                .wrapContentSize().align(Alignment.Center),
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_onboard2square),
                contentDescription = null,
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp, start = 15.dp, end = 15.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Selamat Datang!",
                    style = MaterialTheme.typography.headlineLarge,
                    color = MaterialTheme.colorScheme.scrim
                )

                Text(
                    text = stringResource(id = R.string.onboard_mssg),
                    style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Medium),
                    color = MaterialTheme.colorScheme.scrim,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 15.dp)

                )

                longButton(
                    "SELANJUTNYA",
                    onClick = { navController.navigate(route = Screen.MainMenu.route) },
                )
            }
        }
    }
}


