package com.example.pertemuan12.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pertemuan12.model.Mahasiswa


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