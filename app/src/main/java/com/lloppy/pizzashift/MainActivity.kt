package com.lloppy.pizzashift

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.shiftintensivelivecoding.NetworkModule
import com.lloppy.feature.catalog.data.network.CatalogApi
import com.lloppy.feature.catalog.data.repository.CatalogRepositoryImpl
import com.lloppy.feature.catalog.domain.usecase.GetPizzaCatalogUseCase
import com.lloppy.pizzashift.ui.theme.PizzaShiftTheme
import com.lloppy.shared.domain.converter.CatalogConverter

class MainActivity : ComponentActivity() {

    private val networkModule = NetworkModule()

    private val catalogApi = networkModule.retrofit.create(CatalogApi::class.java)
    private val catalogConverter = CatalogConverter()
    private val catalogRepository = CatalogRepositoryImpl(catalogApi, catalogConverter)
    private val getCatalogUseCase = GetPizzaCatalogUseCase(catalogRepository)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaShiftTheme {
                MainScreen(
                    getPizzaCatalogUseCase = getCatalogUseCase
                )
            }
        }
    }
}
