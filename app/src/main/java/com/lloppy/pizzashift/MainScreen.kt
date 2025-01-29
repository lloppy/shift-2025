package com.lloppy.pizzashift

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lloppy.pizzashift.catalog.CatalogRoute
import com.lloppy.pizzashift.catalog.domain.usecase.GetPizzaCatalogUseCase
import com.lloppy.pizzashift.catalog.presentation.CatalogViewModel
import com.lloppy.pizzashift.catalog.presentation.CatalogViewModelFactory
import com.lloppy.pizzashift.catalog.ui.CatalogScreen

@Composable
fun MainScreen(
    getPizzaCatalogUseCase: GetPizzaCatalogUseCase
) {
    val navController = rememberNavController()

    Surface {
        NavHost(navController = navController, startDestination = CatalogRoute) {
            composable<CatalogRoute> {
                val viewModel: CatalogViewModel =
                    viewModel(factory = CatalogViewModelFactory(getPizzaCatalogUseCase))
                CatalogScreen(
                    viewModel,
                    onItemSelected = {
                        //navController.navigate(DetailsRoute(loanId = it))
                    },
                )
            }
        }
    }
}