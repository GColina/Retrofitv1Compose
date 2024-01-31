package com.kotlin_crew.retrofitv1.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class DisneyViewModel(
    private val repository: DisneyRepository = DisneyRepository(DisneyApi.instance)
) : ViewModel() {
    init {
        viewModelScope.launch {
            repository.getCharacters().onSuccess {
                println()
            }.onFailure {
                println()
            }
        }
    }
}