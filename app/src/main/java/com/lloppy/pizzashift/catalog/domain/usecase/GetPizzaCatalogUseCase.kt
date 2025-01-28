package com.lloppy.pizzashift.catalog.domain.usecase

import com.lloppy.pizzashift.catalog.domain.repository.CatalogRepository
import com.lloppy.pizzashift.catalog.domain.entity.PizzaItem

class GetPizzaCatalogUseCase (private val repository: CatalogRepository) {
    suspend operator fun invoke(): List<PizzaItem> =
        repository.getAll()
}