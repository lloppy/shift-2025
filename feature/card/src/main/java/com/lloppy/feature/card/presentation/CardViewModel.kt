package com.lloppy.feature.card.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CardViewModel(

) : ViewModel() {
    private val _state = MutableStateFlow<CardState>(CardState.Initial)
    val state: StateFlow<CardState> = _state


}