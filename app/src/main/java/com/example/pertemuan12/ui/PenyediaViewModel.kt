package com.example.pertemuan12.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pertemuan12.MahasiswaApplications
import com.example.pertemuan12.ui.viewmodel.DetailViewModel
import com.example.pertemuan12.ui.viewmodel.HomeViewModel
import com.example.pertemuan12.ui.viewmodel.InsertViewModel
import com.example.pertemuan12.ui.viewmodel.UpdateViewModel

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiKontak().container.kontakRepository) }
        initializer { InsertViewModel(aplikasiKontak().container.kontakRepository) }
        initializer { DetailViewModel(aplikasiKontak().container.kontakRepository) }
        initializer { UpdateViewModel(aplikasiKontak().container.kontakRepository) }
    }

    fun CreationExtras.aplikasiKontak():MahasiswaApplications =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as MahasiswaApplications)
}