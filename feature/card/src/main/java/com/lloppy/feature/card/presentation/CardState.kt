package com.lloppy.feature.card.presentation

import com.lloppy.shared.domain.entity.PizzaItem

sealed interface CardState {
    data object Initial : CardState
    data object Loading : CardState
    data class Failure(val message: String?) : CardState
    data class Content(val pizza: PizzaItem) : CardState
}