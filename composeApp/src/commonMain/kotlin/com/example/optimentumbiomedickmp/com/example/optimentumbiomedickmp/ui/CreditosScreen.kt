package com.example.optimentumbiomedickmp.ui
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreditosScreen(
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Créditos") },
                navigationIcon = {
                    TextButton(onClick = onBack) {
                        Text("< Atrás")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color(0xFF004B54), Color(0xFFB9D9D9))
                    )
                )
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "OPTIMENTUM BIOMEDIC",
                style = MaterialTheme.typography.headlineSmall,
                textAlign = TextAlign.Center
            )

            Text(
                text = "Aplicación diseñada para optimizar la gestión de procesos biomédicos, hojas de vida, cotizaciones, inventarios y contratos de equipos médicos.",
                textAlign = TextAlign.Center
            )

            Divider()

            Text(
                text = "Desarrolladores",
                style = MaterialTheme.typography.titleMedium
            )
            Text("Daniel Muñoz Piedrahita")
            Text("Maria Isabel Orozco Vejarano")

            Divider()

            Text(
                text = "Tecnología usada",
                style = MaterialTheme.typography.titleMedium
            )
            Text("Aplicación desarrollada con Kotlin Multiplatform y Compose.")

            Divider()

            Text(
                text = "Versión 1.0.0",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
