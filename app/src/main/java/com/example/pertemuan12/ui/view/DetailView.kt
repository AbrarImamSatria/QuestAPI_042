package com.example.pertemuan12.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.pertemuan12.R
import com.example.pertemuan12.model.Mahasiswa
import com.example.pertemuan12.ui.viewmodel.DetailUiState

@Composable
private fun DetailStatus(
    detailUiState: DetailUiState,
    retryAction: () -> Unit,
    modifier: Modifier = Modifier
) {
    when (detailUiState) {
        is DetailUiState.Loading -> OnLoadingDetail(modifier = modifier.fillMaxSize())
        is DetailUiState.Success -> DetailLayout(
            mahasiswa = detailUiState.mahasiswa,
            modifier = modifier.fillMaxWidth()
        )
        is DetailUiState.Error -> OnErrorDetail(retryAction, modifier = modifier.fillMaxSize())
    }
}

@Composable
private fun OnErrorDetail(retryAction: () -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.eror),
            contentDescription = stringResource(R.string.loading_failed)
        )
        Text(
            text = stringResource(R.string.loading_failed),
            modifier = Modifier.padding(16.dp)
        )
        Button(onClick = retryAction) {
            Text(stringResource(R.string.retry))
        }
    }
}

@Composable
private fun OnLoadingDetail(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.size(200.dp),
        painter = painterResource(R.drawable.loading),
        contentDescription = stringResource(R.string.loading)
    )
}

@Composable
fun DetailLayout(
    mahasiswa: Mahasiswa,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.padding(16.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "NIM: ${mahasiswa.nim}",
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = "Nama: ${mahasiswa.nama}",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "Alamat: ${mahasiswa.alamat}",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "Jenis Kelamin: ${mahasiswa.jenisKelamin}",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "Kelas: ${mahasiswa.kelas}",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "Angkatan: ${mahasiswa.angkatan}",
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}