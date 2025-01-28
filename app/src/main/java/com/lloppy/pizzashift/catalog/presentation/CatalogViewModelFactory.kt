package com.lloppy.pizzashift.catalog.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lloppy.pizzashift.catalog.domain.usecase.GetPizzaCatalogUseCase

class CatalogViewModelFactory(
    private val getPizzaCatalogUseCase: GetPizzaCatalogUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == CatalogViewModel::class.java) { "Unknown ViewModel: $modelClass" }
        return CatalogViewModel(getPizzaCatalogUseCase) as T
    }
}