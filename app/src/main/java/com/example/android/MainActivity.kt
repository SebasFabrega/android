package com.example.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.android.nav.AppNavGraph // CAMBIADO
import com.example.android.ui.theme.AndroidTheme // CAMBIADO

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidTheme {
                AppNavGraph()
            }
        }
    }
}