package com.lloppy.feature.card.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CardViewModelFactory(
    //TODO()
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == CardViewModel::class.java) { "Unknown ViewModel: $modelClass" }
        return CardViewModel() as T
    }
}