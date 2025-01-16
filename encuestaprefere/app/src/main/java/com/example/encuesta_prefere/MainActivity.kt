package com.example.encuesta_prefere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.encuesta_prefere.ui.theme.EncuestaprefereTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EncuestaprefereTheme {
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
    Text(
        text = "Encuesta de preferencias",
        modifier = modifier
    )
    Text(
        text = "Color favorito: "
    )
    OutlinedTextField(value = "", onValueChange = {})
    Text(
        text = "Comida favorita"
    )
    OutlinedTextField(value = "", onValueChange = {})
    Button(onClick = {}) {
        Text(
            text = "Enviar"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EncuestaprefereTheme {
        Greeting("Android")
    }
}