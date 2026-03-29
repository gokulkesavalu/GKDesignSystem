package com.gk.designsystem.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gk.designsystem.theme.GKTheme
import com.gk.designsystem.tokens.componentPadding

@Composable
fun GKButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors   = GKTheme.colors
    val spacing  = GKTheme.spacing

    Button(
        onClick       = onClick,
        modifier      = modifier,
        contentPadding = PaddingValues(
            horizontal = spacing.xl,
            vertical   = spacing.sm,
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = colors.primary,
            contentColor   = colors.onPrimary,
        ),
    ) {
        Text(
            text  = text,
        )
    }
}

@Preview(name = "Light Mode", showBackground = true)
@Preview(name = "Dark Mode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GKButtonPreview() {
    GKTheme {
        Surface {
            GKButton(
                text = "Hello Design System",
                onClick = {},
                modifier = Modifier.padding(GKTheme.spacing.componentPadding)
            )
        }
    }
}
