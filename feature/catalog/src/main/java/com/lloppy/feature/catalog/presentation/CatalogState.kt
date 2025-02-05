package com.lloppy.feature.catalog.presentation

import com.lloppy.shared.domain.entity.PizzaItem


sealed interface CatalogState {
    data object Initial : CatalogState
    data object Loading : CatalogState
    data class Failure(val message: String?) : CatalogState
    data class Content(val pizzaCatalog: List<PizzaItem>) : CatalogState
}