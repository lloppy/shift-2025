package com.lloppy.pizzashift.catalog.data.repository

import com.lloppy.pizzashift.catalog.data.converter.CatalogConverter
import com.lloppy.pizzashift.catalog.data.network.CatalogApi
import com.lloppy.pizzashift.catalog.domain.entity.PizzaItem
import com.lloppy.pizzashift.catalog.domain.repository.CatalogRepository

class CatalogRepositoryImpl(
    private val catalogApi: CatalogApi,
    private val catalogConverter: CatalogConverter
) : CatalogRepository {
    override suspend fun getAll(): List<PizzaItem> {
        val models = catalogApi.getAll().catalog
        return models.map { catalogConverter.convert(it) }
    }

}