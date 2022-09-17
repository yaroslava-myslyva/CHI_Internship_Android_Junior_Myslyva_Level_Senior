package com.example.chi_internship_android_junior_myslyva_level_senior

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {
    val counter = MutableLiveData<Int>(0)

    fun increaseCounter() {
        counter.value = counter.value?.inc()
    }
}