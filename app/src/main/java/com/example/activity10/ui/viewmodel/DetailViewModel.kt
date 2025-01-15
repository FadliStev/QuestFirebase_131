package com.example.activity10.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.activity10.model.Mahasiswa
import com.example.activity10.repository.MahasiswaRepository
import kotlinx.coroutines.launch

class DetailMhsViewModel(
    private val repositoryMhs: MahasiswaRepository,
) : ViewModel(){
    var uiState by mutableStateOf(DetailUiState())
        private set

    fun fetchDetailMahasiswa(nim: String) {
        viewModelScope.launch {
            uiState = DetailUiState(isLoading = true)
            try {
                val mahasiswa = repositoryMhs.getMahasiswaById(nim)
            } catch (e: Exception) {
                e.printStackTrace()
                uiState = DetailUiState(isError = true, errorMessage = "Failed to fetch details: ${e.message}")
            }
        }
    }
}



data class DetailUiState(
    val detailUiEvent: MahasiswaEvent = MahasiswaEvent(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
){
    val isUiEventEmpty: Boolean
        get() = detailUiEvent == MahasiswaEvent()

    val isUiEventNotEmpty: Boolean
        get() = detailUiEvent != MahasiswaEvent()
}

fun Mahasiswa.toDetailUiEvent(): MahasiswaEvent{
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenis_kelamin = jenis_kelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan,
        judulSkripsi = judulSkripsi
    )
}