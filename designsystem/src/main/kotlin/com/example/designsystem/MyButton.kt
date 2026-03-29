package com.example.designsystem

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyButton(
    text: String,
    onClick: () -> Unit
) {
    Button(onClick = onClick) {
        Text(text = text)
    }
}

@Preview
@Composable
fun MyButtonPreview() {
    MyButton(text = "Hello Design System", onClick = {})
}
