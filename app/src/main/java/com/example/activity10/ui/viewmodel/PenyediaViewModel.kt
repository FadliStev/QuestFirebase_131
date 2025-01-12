package com.example.activity10.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.activity10.MahasiswaApplication

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiMahasiswa().container.mahasiswaRepository) }
        initializer { InsertViewModel(aplikasiMahasiswa().container.mahasiswaRepository) }
    }
}

fun CreationExtras.aplikasiMahasiswa(): MahasiswaApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplication)