package com.gk.designsystem.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gk.designsystem.theme.GKTheme
import com.gk.designsystem.tokens.componentPadding

@Composable
fun GKText(
    text: String,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text,
        modifier = modifier,
        style = GKTheme.typography.bodyMedium
    )
}

@Preview(name = "Light Mode", showBackground = true)
@Preview(name = "Dark Mode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GKTextPreview() {
    GKTheme {
        Surface {
            GKText(
                text = "Hello GK Design System",
                modifier = Modifier.padding(GKTheme.spacing.componentPadding)
            )
        }
    }
}
