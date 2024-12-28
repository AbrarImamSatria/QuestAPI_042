package com.example.pertemuan12.ui.viewmodel

import com.example.pertemuan12.model.Mahasiswa

sealed class HomeUiState{
    data class Succes(val mahasiswa: List<Mahasiswa>):HomeUiState()
    object Error:HomeUiState()
    object Loading:HomeUiState()
}