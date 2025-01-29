package com.lloppy.pizzashift.catalog.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import com.lloppy.pizzashift.R
import com.lloppy.pizzashift.catalog.presentation.CatalogState
import com.lloppy.pizzashift.catalog.presentation.CatalogViewModel


@Composable
fun CatalogScreen(
    catalogViewModel: CatalogViewModel,
    onItemSelected: (loanId: Long) -> Unit,
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