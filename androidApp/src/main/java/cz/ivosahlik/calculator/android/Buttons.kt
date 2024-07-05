package cz.ivosahlik.calculator.android

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun extraButton(
    modifier: Modifier = Modifier,
    text: String,
    onCLick: (String) -> Unit
) {
    flatButton(
        text = text,
        backgroundColor = Color.DarkGray,
        onCLick = onCLick
    )
}
@Composable
fun digitButton(
    modifier: Modifier = Modifier,
    text: String,
    onCLick: (String) -> Unit
) {
    flatButton(
        text = text,
        backgroundColor = Color.Gray,
        onCLick = onCLick
    )
}

@Composable
fun operatorButton(
    modifier: Modifier = Modifier,
    text: String,
    onCLick: (String) -> Unit
) {
    flatButton(
        text = text,
        backgroundColor = Color.Yellow,
        onCLick = onCLick
    )
}

@Composable
fun flatButton(
    modifier: Modifier = Modifier,
    text: String,
    backgroundColor: Color,
    contentColor: Color = Color.White,
    onCLick: (String) -> Unit
) {
    Button(
        onClick = { onCLick(text) },
        modifier = modifier
            .heightIn(min = 80.dp)
            .padding(1.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = contentColor,
            containerColor = backgroundColor
        )
    ) {
        Text(
            text = text,
            style =  TextStyle(fontSize = 30.sp)
        )
    }
}