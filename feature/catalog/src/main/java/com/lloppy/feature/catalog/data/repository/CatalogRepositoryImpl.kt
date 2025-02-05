package com.lloppy.feature.catalog.data.repository

import com.lloppy.feature.catalog.data.network.CatalogApi
import com.lloppy.feature.catalog.domain.repository.CatalogRepository
import com.lloppy.shared.domain.converter.CatalogConverter
import com.lloppy.shared.domain.entity.PizzaItem

class CatalogRepositoryImpl(
    private val catalogApi: CatalogApi,
    private val catalogConverter: CatalogConverter
) : CatalogRepository {
    override suspend fun getAll(): List<PizzaItem> {
        val models = catalogApi.getAll().catalog
        return models.map { catalogConverter.convert(it) }
    }

}