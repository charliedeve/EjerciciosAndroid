package com.example.deja_comentario

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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.deja_comentario.ui.theme.DejacomentarioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DejacomentarioTheme {
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
        text = "Deja un comentario",
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
           text = "Comentario: "
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
    DejacomentarioTheme {
        Greeting("Android")
    }
}