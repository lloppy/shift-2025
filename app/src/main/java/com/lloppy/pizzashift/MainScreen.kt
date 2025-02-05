package com.lloppy.pizzashift

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.lloppy.feature.catalog.domain.usecase.GetPizzaCatalogUseCase
import com.lloppy.feature.catalog.presentation.CatalogViewModel
import com.lloppy.feature.catalog.presentation.CatalogViewModelFactory
import com.lloppy.feature.catalog.ui.CatalogScreen

@Composable
fun MainScreen(
    getPizzaCatalogUseCase: GetPizzaCatalogUseCase
) {
    val navController = rememberNavController()

    Surface {
        NavHost(
            navController = navController,
            startDestination = com.lloppy.feature.catalog.CatalogRoute
        ) {
            composable<com.lloppy.feature.catalog.CatalogRoute> {
                val viewModel: CatalogViewModel =
                    viewModel(factory = CatalogViewModelFactory(getPizzaCatalogUseCase))
                CatalogScreen(
                    viewModel,
                    onItemSelected = {
                        navController.navigate(com.lloppy.feature.card.CardRoute(pizzaId = it.id))
                    }
                )
            }
            composable<com.lloppy.feature.card.CardRoute> {
                val destination = it.toRoute<com.lloppy.feature.card.CardRoute>()
                com.lloppy.feature.card.ui.CardScreen(
                    destination.pizzaId,
                    navController
                )
            }
        }
    }
}