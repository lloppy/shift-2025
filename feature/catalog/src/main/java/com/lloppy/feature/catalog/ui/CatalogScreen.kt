package com.lloppy.feature.catalog.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import com.lloppy.feature.catalog.R
import com.lloppy.feature.catalog.presentation.CatalogState
import com.lloppy.feature.catalog.presentation.CatalogViewModel
import com.lloppy.shared.domain.entity.PizzaItem

@Composable
fun CatalogScreen(
    catalogViewModel: CatalogViewModel,
    onItemSelected: (pizzaItem: PizzaItem) -> Unit
) {
    val catalogState by catalogViewModel.state.collectAsState()

    LaunchedEffect(Unit) {
        catalogViewModel.loadPizzaCatalog()
    }

    when (val state = catalogState) {
        is CatalogState.Initial, is CatalogState.Loading -> LoadingComponent()

        is CatalogState.Failure -> ErrorComponent(
            message = state.message ?: stringResource(id = R.string.error_unknown_error),
            onRetry = { catalogViewModel.loadPizzaCatalog() },
        )

        is CatalogState.Content -> ContentComponent(
            pizzas = state.pizzaCatalog,
            onItemClicked = onItemSelected
        )
    }
}