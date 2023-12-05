package com.yogahindu4011.ui.view.common


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yogahindu4011.R
import com.yogahindu4011.ui.theme.YogaHinduTheme

@Composable
fun simpanDialog(
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
    dialogTitle: String,
    dialogText: String,
    modifier: Modifier = Modifier
){
    AlertDialog(
        icon = {
            Icon(
                painterResource(id = R.drawable.ic_check_circle),
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

        onDismissRequest = {
            onDismissRequest()
        },

        confirmButton = {
            Button(
                onClick = {onConfirmation()},
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                )
            ){
                Text("OK", style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold))
            }
        },

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
            onDismissRequest = {},
            onConfirmation = {},
            dialogTitle = "BERHASIL TERSIMPAN",
            dialogText = "Anda akan diarahkan kembali ke Menu Utama"
        )
    }
}
@Composable
fun konfirmasiDialog(
    onDismissRequest: () -> Unit,
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
            onDismissRequest()
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
                onClick = {onDismissRequest()},
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

@Composable
@Preview
fun prevDialConfirm(){
    YogaHinduTheme { konfirmasiDialog(onDismissRequest = {}, onConfirmation = {}, dialogTitle = "BATALKAN LATIHAN ?") }
}


/*shortButton(
text = "KEMBALI KE MENU",
onClick = { onConfirmation () }
)*/