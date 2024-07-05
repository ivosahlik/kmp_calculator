package cz.ivosahlik.calculator.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column(Modifier.fillMaxSize()) {
                    Text(text = "0",
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.End)
                            .padding(10.dp)
                            .background(color = Color.DarkGray),
                        style = TextStyle(fontSize = 45.sp)
                    )
                    Row (
                        Modifier.align(Alignment.Start).fillMaxWidth()
                    ) {
                        extraButton(text = "AC", onCLick = {})
                        extraButton(text = "+/-", onCLick = {})
                        extraButton(text = "%", onCLick = {})
                        extraButton(text = "/", onCLick = {})
                    }
                    Row (
                        Modifier.align(Alignment.Start).fillMaxWidth()
                    ) {
                        digitButton(text = "7", onCLick = {})
                        digitButton(text = "8", onCLick = {})
                        digitButton(text = "9", onCLick = {})
                        digitButton(text = "*", onCLick = {})
                    }
                    Row (
                        Modifier.align(Alignment.Start).fillMaxWidth()
                    ){
                        digitButton(text = "4", onCLick = {})
                        digitButton(text = "5", onCLick = {})
                        digitButton(text = "6", onCLick = {})
                        digitButton(text = "-", onCLick = {})
                    }
                    Row (
                        Modifier.align(Alignment.Start).fillMaxWidth()
                    ){
                        digitButton(text = "1", onCLick = {})
                        digitButton(text = "2", onCLick = {})
                        digitButton(text = "3", onCLick = {})
                        digitButton(text = "+", onCLick = {})
                    }
                    Row (
                        Modifier.align(Alignment.Start).fillMaxWidth()
                    ){
                        digitButton(
                            modifier = Modifier.weight(2f),
                            text = "0",
                            onCLick = {})
                        digitButton(text = ".", onCLick = {})
                        operatorButton(text = "=", onCLick = {})

                    }
                }
            }
        }
    }
}
