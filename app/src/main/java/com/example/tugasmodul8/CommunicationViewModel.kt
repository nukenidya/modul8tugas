package com.example.tugasmodul8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mGender = MutableLiveData<String>()
    private val mPesan = MutableLiveData<String>()

    val name: LiveData<String>
        get() = mName
    val gender: LiveData<String>
        get() = mGender
    val pesan: LiveData<String>
        get() = mPesan

    fun setName(name: String){
        mName.value = name
    }
    fun setGender(gender: String){
        mGender.value = gender
    }
    fun setPesan(pesan: String){
        mPesan.value = pesan
    }
}