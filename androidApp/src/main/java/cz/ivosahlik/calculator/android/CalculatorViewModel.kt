package cz.ivosahlik.calculator.android

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CalculatorViewModel {
    private val _state = MutableStateFlow(CalculatorState())
    val state = _state.asStateFlow()

    fun onOperatorCLick(button: String) {
        when (button) {
            "AC" -> { /* TODO: reset the state */ }
            "+/-" -> { /* TODO: plus/minus opt*/ }
            "+", "-", "/", "%", "*" -> { }
            "." -> { }
            "=" -> { /* TODO: calculate result */ }
            else -> { }
        }
    }
}