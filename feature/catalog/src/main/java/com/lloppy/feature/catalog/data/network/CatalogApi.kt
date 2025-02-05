package com.lloppy.feature.catalog.data.network

import com.lloppy.shared.domain.model.PizzasResponse
import retrofit2.http.GET

interface CatalogApi {
    @GET("catalog")
    suspend fun getAll(): PizzasResponse
}