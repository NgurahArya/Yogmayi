@file:OptIn(ExperimentalMaterial3Api::class)

package com.yogahindu4011.presentation.common


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.yogahindu4011.R
import com.yogahindu4011.navigation.Screen
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun simpanDialog(
    icon: Int,
    onDismissRequest: () -> Unit,
    onConfirmation: (NavController) -> Unit,
    dialogTitle: String,
    dialogText: String,
    navController: NavController,
    modifier: Modifier = Modifier
){
    AlertDialog(
        icon = {
            Icon(
                painterResource(id = icon),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary
            )
        },

        title = {
            Text(
                text = dialogTitle,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
        },

        text = {
            Text(
                text = dialogText,
                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Normal),
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )
        },

        confirmButton = {
            Button(
                onClick = {
                    onConfirmation(navController)
                    navController.navigate(route = Screen.MainMenu.route)
                    onDismissRequest()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                )
            ){
                Text("OK", style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold))
            }
        },

        onDismissRequest = {onDismissRequest()},

        modifier = Modifier
            .border(width = 2.dp, color = MaterialTheme.colorScheme.outline, RoundedCornerShape(size = 25.dp))
            .width(300.dp)
            .height(300.dp)
    )
}

@Composable
@Preview
fun dialogPrev(){
    YogaHinduTheme {
        simpanDialog(
            icon = R.drawable.ic_check_circle,
            onDismissRequest = {},
            onConfirmation = {},
            dialogTitle = "BERHASIL TERSIMPAN",
            dialogText = "Anda akan diarahkan kembali ke Menu Utama",
            navController = rememberNavController()
        )
    }
}
@Composable
fun konfirmasiDialog(
    openDialog: MutableState<Boolean>,
    onConfirmation: () -> Unit,
    dialogTitle: String,
    modifier: Modifier = Modifier
){
    AlertDialog(
        title = {
            Text(
                text = dialogTitle,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
        },

        onDismissRequest = {
            openDialog.value = false
        },

        confirmButton = {
            Button(
                onClick = {onConfirmation()},
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                )
            ){
                Text("YA", style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold))
            }
        },

        dismissButton = {
            Button(
                onClick = {openDialog.value = false},
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.error,
                    contentColor = MaterialTheme.colorScheme.onError
                )
            ){
                Text("TIDAK", style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold))
            }
        },

        modifier = Modifier
            .border(width = 2.dp, color = MaterialTheme.colorScheme.outline, RoundedCornerShape(size = 25.dp))
    )
}

/*@Composable
@Preview
fun prevDialConfirm(){
    YogaHinduTheme { konfirmasiDialog(onDismissRequest = {}, onConfirmation = {}, dialogTitle = "BATALKAN LATIHAN ?") }
}*/

@Composable
fun NameDialogAfter(
    saveName: (String) -> Unit,
    openName: MutableState<Boolean>,
    currentName: State<String?>
){
    val name = remember{
        mutableStateOf(currentName.value ?: "")
    }

    AlertDialog(
        title = {
            Text(
                text = "Silahkan Ubah Nama Anda",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )
        },

        confirmButton = {
            Button(
                onClick = {
                    saveName.invoke(name.value)
                    openName.value = false
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                )
            ){
                Text("OK", style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold))
            }
        },

        text = {

            TextField(
                modifier = Modifier.fillMaxWidth() .padding(bottom = 5.dp),
                value = name.value,
                label = { Text("Masukan Nama Anda") },
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = MaterialTheme.colorScheme.onBackground,
                    MaterialTheme.colorScheme.surface,
                ),
                onValueChange = {newName ->
                    name.value = newName
                },
                shape = RoundedCornerShape(size = 10.dp)

            )
        },

        onDismissRequest = {openName.value = false},

        modifier = Modifier
            .border(width = 2.dp, color = MaterialTheme.colorScheme.outline, RoundedCornerShape(size = 25.dp))
            .height(250.dp)
    )
}
@Composable
fun NameDialog(
    saveName: (String) -> Unit,
    openName: MutableState<Boolean>,
    currentName: State<String?>
){
    val name = remember{
        mutableStateOf(currentName.value ?: "")
    }

    AlertDialog(
        title = {
            Text(
                text = "Selamat Datang di YOGMAYI!",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
        },

        icon = {
            Icon(
                painterResource(id = R.drawable.ic_applogowhite),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary
            )
        },

        confirmButton = {
            Button(
                onClick = {
                   saveName.invoke(name.value)
                    openName.value = false
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                )
            ){
                Text("OK", style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold))
            }
        },

        text = {

            TextField(
                modifier = Modifier.fillMaxWidth() .padding(bottom = 5.dp),
                value = name.value,
                label = { Text("Masukan Nama Anda") },
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = MaterialTheme.colorScheme.onBackground,
                    MaterialTheme.colorScheme.surface,
                ),
                onValueChange = {newName ->
                    name.value = newName
                },
                shape = RoundedCornerShape(size = 10.dp)

            )
        },

        onDismissRequest = {openName.value = false},

        modifier = Modifier
            .border(width = 2.dp, color = MaterialTheme.colorScheme.outline, RoundedCornerShape(size = 25.dp))
            .height(500.dp)
    )
}

//text = {
//            Text(
//                text = "Untuk memulai masukan nama terlebih dahulu",
//                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Normal),
//                color = MaterialTheme.colorScheme.onBackground,
//                textAlign = TextAlign.Center
//            )
//        },


/*@Composable
fun dialogTest(
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
    dialogTitle: String,
){
    AlertDialog(
        title = {
            Text(
                text = dialogTitle,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
        },

        confirmButton = {
            Button(
                onClick = {
                    onConfirmation()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                )
            ){
                Text("OK", style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold))
            }
        },

        onDismissRequest = {onDismissRequest()},
    )
}

@Composable
@Preview
fun DiaPrev(){
    dialogTest(
        onDismissRequest = {},
        onConfirmation = {},
        dialogTitle = "Test"
    )
}*/

/*shortButton(
text = "KEMBALI KE MENU",
onClick = { onConfirmation () }
)*/