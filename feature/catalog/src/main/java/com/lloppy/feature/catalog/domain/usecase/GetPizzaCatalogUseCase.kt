package com.lloppy.feature.catalog.domain.usecase

import com.lloppy.feature.catalog.domain.repository.CatalogRepository
import com.lloppy.shared.domain.entity.PizzaItem

class GetPizzaCatalogUseCase(private val repository: CatalogRepository) {
    suspend operator fun invoke(): List<PizzaItem> =
        repository.getAll()
}