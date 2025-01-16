package com.example.inscripcion_evento

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.inscripcion_evento.ui.theme.InscripcioneventoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InscripcioneventoTheme {
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
        text = "Formulario Registro",
        modifier = modifier
    )
        Text(
            text = "Nombre: "
        )
        OutlinedTextField(value = "", onValueChange = {})
        Text(
            text = "Email: "
        )
        OutlinedTextField(value = "", onValueChange = {})
        Text(
            text = "Contraseña: "
        )
        OutlinedTextField(value = "", onValueChange = {})
        Button(onClick = {}) {
            Text(
                text = "Registrarse"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InscripcioneventoTheme {
        Greeting("Android")
    }
}