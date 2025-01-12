package com.example.activity10.ui.viewmodel

import com.example.activity10.model.Mahasiswa


data class FormErrorState(
    val nim: String? = null,
    val nama: String? = null,
    val jenis_kelamin: String? = null,
    val alamat: String? = null,
    val kelas: String? = null,
    val angkatan: String? = null,
)

fun MahasiswaEvent.toMhsModel() : Mahasiswa = Mahasiswa(
    nim = nim,
    nama = nama,
    jenis_kelamin = jenis_kelamin,
    alamat = nim,
    kelas = nim,
    angkatan = nim,

)

data class MahasiswaEvent(
    val nim: String = "",
    val nama: String = "",
    val jenis_kelamin: String = "",
    val alamat: String = "",
    val kelas: String = "",
    val angkatan: String = "",
)