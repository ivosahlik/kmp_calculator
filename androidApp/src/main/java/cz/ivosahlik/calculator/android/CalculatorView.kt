package cz.ivosahlik.calculator.android

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorView() {
    val buttons = remember {
        listOf(
            listOf("AC", "+/-", "%", "/"),
            listOf("7", "8", "9", "*"),
            listOf("4", "5", "6", "-"),
            listOf("1", "2", "3", "+"),
            listOf("0",      ".", "=")
        )
    }
    val operators = remember { listOf("/", "*", "+", "-", "=") }
    val extraOperators = remember { listOf("AC", "+/-", "%") }
    val viewModel = remember { CalculatorViewModel() }
    val state = viewModel.state.collectAsState()
    Column(Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = state.value.currentOperand,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.DarkGray),
            textAlign = TextAlign.End,
            color = Color.White,
            style = TextStyle(fontSize = 45.sp)
        )
        buttons.forEach { rowButtons ->
            Row (
                Modifier
                    .align(Alignment.Start)
                    .fillMaxWidth()
            ) {
                rowButtons.forEachIndexed { index, item ->
                    when {
                        extraOperators.contains(item) -> {
                            extraButton(
                                modifier = Modifier.weight(1f),
                                text = item,
                                onCLick = viewModel::onOperatorCLick
                            )
                        }
                        operators.contains(item) -> {
                            operatorButton(
                                modifier = Modifier.weight(1f),
                                text = item,
                                onCLick = viewModel::onOperatorCLick
                            )
                        } else -> {
                        digitButton(
                            modifier = Modifier.weight(
                                if (rowButtons.size < 4 && index == 0) 2f else 1f
                            ),
                            text = item,
                            onCLick = viewModel::onOperatorCLick
                        )}
                    }
                }
            }
        }
    }
}