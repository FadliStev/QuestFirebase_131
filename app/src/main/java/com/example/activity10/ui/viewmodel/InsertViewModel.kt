package com.example.activity10.ui.viewmodel

import com.example.activity10.model.Mahasiswa


fun MahasiswaEvent.toMhsModel() : Mahasiswa = Mahasiswa(

)

data class MahasiswaEvent(
    val nim: String = "",
    val nama: String = "",
    val jenis_kelamin: String = "",
    val alamat: String = "",
    val kelas: String = "",
    val angkatan: String = "",
)