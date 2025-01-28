package com.lloppy.pizzashift.catalog.data.network

import com.lloppy.pizzashift.catalog.data.model.PizzasResponse
import retrofit2.http.GET

interface CatalogApi {
    @GET("catalog")
    suspend fun getAll(): PizzasResponse
}