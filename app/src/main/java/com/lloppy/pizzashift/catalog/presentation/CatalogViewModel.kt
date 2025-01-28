package com.lloppy.pizzashift.catalog.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lloppy.pizzashift.catalog.domain.usecase.GetPizzaCatalogUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException

class CatalogViewModel(
    private val getPizzaCatalogUseCase: GetPizzaCatalogUseCase
) : ViewModel() {
    private val _state = MutableStateFlow<CatalogState>(CatalogState.Initial)
    val state: StateFlow<CatalogState> = _state

    fun loadPizzaCatalog() {
        viewModelScope.launch {
            _state.value = CatalogState.Loading

            try {
                val pizzas = getPizzaCatalogUseCase()
                _state.value = CatalogState.Content(pizzas)
            } catch (ce: CancellationException) {
                throw ce
            } catch (ex: Exception) {
                _state.value = CatalogState.Failure(ex.localizedMessage.orEmpty())
                Log.e("CatalogState", ex.localizedMessage.orEmpty())
            }
        }
    }
}