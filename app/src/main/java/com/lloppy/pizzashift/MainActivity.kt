package com.lloppy.pizzashift

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.shiftintensivelivecoding.NetworkModule
import com.lloppy.pizzashift.catalog.data.converter.CatalogConverter
import com.lloppy.pizzashift.catalog.data.network.CatalogApi
import com.lloppy.pizzashift.catalog.data.repository.CatalogRepositoryImpl
import com.lloppy.pizzashift.catalog.domain.usecase.GetPizzaCatalogUseCase
import com.lloppy.pizzashift.ui.theme.PizzaShiftTheme

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
