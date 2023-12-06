package com.yogahindu4011.presentation.menu_belajarYoga.materiView

import android.app.Activity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import coil.compose.AsyncImage
import com.yogahindu4011.data.MateriBelajar
import com.yogahindu4011.viewModel.MateriViewModel

@Composable
fun MateriScreen(viewModel: MateriViewModel){
    val materi = viewModel.materiLiveData.value

    LazyColumn {
        if (materi != null) {
            items(materi) { materi->
                MateriItem(materi)
            }
        }else{

        }
    }
}

@Composable
fun MateriItem(materi: MateriBelajar){
    Column {
        AsyncImage(
            model = materi.imageUrl,
            contentDescription = "Article Image"
        )
        Text(text = materi.title, style=MaterialTheme.typography.labelLarge, color = MaterialTheme.colorScheme.onBackground)
        Text(text = materi.body, style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onBackground)

    }
}

@Composable
@Preview
fun MateriListPreview() {
    val activity = LocalContext.current as? Activity ?: return
    val viewModel = ViewModelProvider(activity).get<MateriViewModel>()

    MateriScreen(
        viewModel = viewModel
    )
}