package com.example.optimentumbiomedickmp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onHojaVida: () -> Unit,
    onCotizacion: () -> Unit,
    onInventario: () -> Unit,
    onContrato: () -> Unit,
    onCreditos: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("OPTIMENTUM BIOMEDIC") }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Bienvenido, Inge",
                style = MaterialTheme.typography.headlineSmall
            )

            Button(
                onClick = onHojaVida,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("REALIZAR HOJAS DE VIDA")
            }

            Button(
                onClick = onCotizacion,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("COTIZACION DE SERVICIOS Y EQUIPO")
            }

            Button(
                onClick = onInventario,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("INVENTARIO DE EQUIPOS")
            }

            Button(
                onClick = onContrato,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("CONTRATO")
            }

            Button(
                onClick = onCreditos,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
            ) {
                Text("Créditos")
            }
        }
    }
}
