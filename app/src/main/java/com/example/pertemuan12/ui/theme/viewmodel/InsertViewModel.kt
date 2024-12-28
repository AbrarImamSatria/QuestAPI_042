package com.example.pertemuan12.ui.theme.viewmodel

import kotlinx.serialization.SerialName

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent()
)

data class InsertUiEvent(
    val nim:String="",
    val nama: String="",
    val alamat: String="",
    val jenisKelamin: String="",
    val kelas: String="",
    val angkatan: String=""
)