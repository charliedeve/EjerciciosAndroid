package com.example.encuesta_satisfac

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.encuesta_satisfac.ui.theme.EncuestasatisfacTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EncuestasatisfacTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
    Text(
        text = "Encuesta de satisfacción!",
        modifier = modifier
    )
        Text(
            text = "Nombre: "
        )
        OutlinedTextField(value = "", onValueChange = {})
        Text(
            text = "Nivel de satisfacción"
        )
        Slider(
            value = 0f,
            onValueChange = {},
            valueRange = 0f..100f,
            steps = 10,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Comentarios: "
        )
        TextField(value = "", onValueChange = {})
        Button(onClick = {}) {
            Text(
                text = "Enviar"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EncuestasatisfacTheme {
        Greeting("Android")
    }
}