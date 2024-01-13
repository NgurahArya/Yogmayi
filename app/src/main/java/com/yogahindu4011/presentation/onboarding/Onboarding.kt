@file:OptIn(ExperimentalMaterial3Api::class)

package com.yogahindu4011.presentation.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yogahindu4011.R
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.presentation.common.konfirmasiDialog
import com.yogahindu4011.presentation.common.longButton
import com.yogahindu4011.presentation.common.shortButton
import com.yogahindu4011.viewModel.YogaViewModel

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
    navController: NavController,
    viewModel: YogaViewModel
){

    val nameState = viewModel.nameFlow.collectAsState("")

    val name = remember{
        mutableStateOf(nameState.value ?: "")
    }

    val saveName =  viewModel::saveName

    val isDialog = remember { mutableStateOf(false) }

    if (isDialog.value){
        konfirmasiDialog(
            openDialog = isDialog,
            onConfirmation = {
                isDialog.value = false
                saveName.invoke(name.value)
                navController.navigate(route = Screen.MainMenu.route)
            },
            dialogTitle = "Nama Anda Kosong \n\nTetap Lanjutkan?"
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ){
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp)
            .background(color = MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_applogo12),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .size(300.dp)
                    .padding(bottom = 15.dp)
            )

            Text(
                text = "Selamat Datang!".uppercase(),
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.scrim,
                modifier = Modifier
                    .padding(bottom = 20.dp)
            )

            /*Text(
                text = stringResource(id = R.string.onboard_mssg).uppercase(),
                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Medium),
                color = MaterialTheme.colorScheme.scrim,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(bottom = 15.dp)

            )*/

            Text(
                text = "Untuk memulai, silahkan masukan nama Anda",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.secondary,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(bottom = 15.dp)

            )

            TextField(
                modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp),
                value = name.value,
                textStyle = MaterialTheme.typography.labelSmall,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = MaterialTheme.colorScheme.onBackground,
                    MaterialTheme.colorScheme.surface,
                ),
                singleLine = true,
                onValueChange = { newName ->
                    name.value = newName
                },
                shape = RoundedCornerShape(size = 10.dp)

            )

            Row(
                horizontalArrangement = Arrangement.End, // Align to the right
                modifier = Modifier.fillMaxWidth() // Ensure Row takes full width
            ) {
                shortButton(
                    "SELANJUTNYA",
                    onClick = {
                        if (name.value == "") {
                            isDialog.value = true
                        } else {
                            saveName.invoke(name.value)
                            navController.navigate(route = Screen.MainMenu.route)
                        }

                    }
                )
            }
        }
    }

}



/*@Preview
@Composable
fun PrevOnboard(){
    YogaHinduTheme {
        OnboardingPage(navController = rememberNavController())
    }
}*/
