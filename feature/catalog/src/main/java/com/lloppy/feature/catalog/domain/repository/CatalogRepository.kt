package com.lloppy.feature.catalog.domain.repository

import com.lloppy.shared.domain.entity.PizzaItem

interface CatalogRepository {
    suspend fun getAll(): List<PizzaItem>
}