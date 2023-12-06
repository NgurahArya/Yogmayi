package com.yogahindu4011.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yogahindu4011.data.MateriBelajar
import com.yogahindu4011.data.MateriRepository

class MateriViewModel(private val materiRepository:MateriRepository) :ViewModel() {

    val materiLiveData = MutableLiveData<List<MateriBelajar>>()

    init {
        loadMateri()
    }

    fun loadMateri(){
        materiLiveData.value = materiRepository.getAllMateri()
    }
}