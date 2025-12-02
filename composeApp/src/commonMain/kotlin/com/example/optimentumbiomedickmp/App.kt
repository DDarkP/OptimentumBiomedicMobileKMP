package com.example.optimentumbiomedickmp


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import com.example.optimentumbiomedickmp.ui.LoginScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {

        var isLoggedIn by remember { mutableStateOf(false) }
        var showRegister by remember { mutableStateOf(false) }

        when {
            !isLoggedIn && !showRegister -> {
                LoginScreen(
                    onLoginSuccess = { isLoggedIn = true },
                    onRegisterClick = { showRegister = true }
                )
            }

            showRegister -> {
                Text("Pantalla de Registro (aquí pones tu UI)")
            }

            isLoggedIn -> {
                Text("Bienvenido! Pantalla principal")
            }
        }
    }
}
