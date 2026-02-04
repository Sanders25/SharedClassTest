package com.example.sharedclasstest

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.shared.SharedClass
import com.example.sharedclasstest.ui.theme.SharedClassTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.d("ASDFG", "Activity:${SharedClass.INTEGER}")
        setContent {
            SharedClassTestTheme {
            }
        }
    }
}