package com.example.activity10

import android.app.Application
import com.example.activity10.di.AppContainer
import com.example.activity10.di.MahasiswaContainer

class MahasiswaApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}