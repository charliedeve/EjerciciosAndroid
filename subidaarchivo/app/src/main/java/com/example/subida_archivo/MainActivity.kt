package com.example.subida_archivo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.subida_archivo.ui.theme.SubidaarchivoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SubidaarchivoTheme {
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
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { }
    Column {
    Text(
        text = "Subida de archivos",
        modifier = modifier
    )
        Text(
            text = "Selecciona un archivo: "
        )
        Button(onClick = {launcher.launch("*/*")}) {
            Text(
                text = "Seleccionar archivo"
            )
        }
        Button(onClick = {}) {
            Text(
                text = "Subir"
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SubidaarchivoTheme {
        Greeting("Android")
    }
}