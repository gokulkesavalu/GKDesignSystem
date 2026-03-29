package com.gk.designsystem.components

import android.content.res.Configuration
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gk.designsystem.theme.GKTheme
import com.gk.designsystem.tokens.componentPadding

/**
 * Defines the visual style of the [GKButton].
 */
enum class ButtonType {
    /** Solid background with primary branding colors. */
    PRIMARY,

    /** Solid background with secondary/tonal branding colors. */
    SECONDARY,

    /** Outlined border with transparent background. */
    OUTLINE
}

/**
 * Defines the operational and visibility status of the [GKButton].
 */
enum class ButtonStatus {
    /** Button is interactive and visually normal. */
    ENABLED,

    /** Button is visible but non-interactive and greyed out. */
    DISABLED,

    /** Button is non-interactive and displays a loading indicator. */
    LOADING,

    /** Button is not part of the UI tree. */
    HIDDEN
}

/**
 * A highly customizable themed button component following the GK Design System.
 *
 * @param text The label text to display inside the button.
 * @param onClick Called when the user clicks the button. Only triggered if [status] is [ButtonStatus.ENABLED].
 * @param modifier The modifier to be applied to the button layout.
 * @param type The visual variant of the button (Primary, Secondary, or Outline).
 * @param status The current state of the button (Enabled, Disabled, Loading, or Hidden).
 */
@Composable
fun GKButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    type: ButtonType = ButtonType.PRIMARY,
    status: ButtonStatus = ButtonStatus.ENABLED,
) {
    if (status == ButtonStatus.HIDDEN) return

    val colors = GKTheme.colors
    val spacing = GKTheme.spacing
    val contentPadding = PaddingValues(
        horizontal = spacing.xl,
        vertical = spacing.sm,
    )

    val isEnabled = status == ButtonStatus.ENABLED
    val isLoading = status == ButtonStatus.LOADING

    // Map status to Material Button's enabled state.
    // We disable the button during LOADING to prevent redundant clicks.
    val effectivelyEnabled = status == ButtonStatus.ENABLED

    val buttonColors = when (type) {
        ButtonType.PRIMARY -> ButtonDefaults.buttonColors(
            containerColor = colors.primary,
            contentColor = colors.onPrimary,
            disabledContainerColor = if (isLoading) colors.primary else colors.disabledContainer,
            disabledContentColor = if (isLoading) colors.onPrimary else colors.disabledContent
        )
        ButtonType.SECONDARY -> ButtonDefaults.buttonColors(
            containerColor = colors.secondaryContainer,
            contentColor = colors.onSecondaryContainer,
            disabledContainerColor = if (isLoading) colors.secondaryContainer else colors.disabledContainer,
            disabledContentColor = if (isLoading) colors.onSecondaryContainer else colors.disabledContent
        )
        ButtonType.OUTLINE -> ButtonDefaults.outlinedButtonColors(
            contentColor = colors.primary,
            disabledContentColor = if (isLoading) colors.primary else colors.disabledContent
        )
    }

    val content: @Composable () -> Unit = {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.defaultMinSize(minWidth = 64.dp)
        ) {
            // Keep text in layout but invisible during loading to maintain button size
            Text(
                text = text,
                modifier = Modifier.graphicsLayer { alpha = if (isLoading) 0f else 1f }
            )
            if (isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(20.dp),
                    color = LocalContentColor.current,
                    strokeWidth = 2.dp
                )
            }
        }
    }

    when (type) {
        ButtonType.PRIMARY, ButtonType.SECONDARY -> {
            Button(
                onClick = onClick,
                modifier = modifier.animateContentSize(),
                enabled = effectivelyEnabled,
                contentPadding = contentPadding,
                colors = buttonColors,
                content = { content() }
            )
        }

        ButtonType.OUTLINE -> {
            OutlinedButton(
                onClick = onClick,
                modifier = modifier.animateContentSize(),
                enabled = effectivelyEnabled,
                contentPadding = contentPadding,
                colors = buttonColors,
                border = if (status == ButtonStatus.ENABLED || status == ButtonStatus.LOADING) {
                    BorderStroke(1.dp, colors.outline)
                } else null,
                content = { content() }
            )
        }
    }
}

@Preview(name = "Light Mode", showBackground = true)
@Preview(name = "Dark Mode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GKButtonPreview() {
    GKTheme {
        Surface {
            Column(
                modifier = Modifier
                    .padding(GKTheme.spacing.componentPadding)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(GKTheme.spacing.xl)
            ) {
                // Primary Variants
                Column(verticalArrangement = Arrangement.spacedBy(GKTheme.spacing.xs)) {
                    Text(text = "Primary", style = GKTheme.typography.titleSmall)
                    Row(horizontalArrangement = Arrangement.spacedBy(GKTheme.spacing.md)) {
                        GKButton(text = "Enabled", type = ButtonType.PRIMARY, status = ButtonStatus.ENABLED, onClick = {})
                        GKButton(text = "Disabled", type = ButtonType.PRIMARY, status = ButtonStatus.DISABLED, onClick = {})
                        GKButton(text = "Loading", type = ButtonType.PRIMARY, status = ButtonStatus.LOADING, onClick = {})
                    }
                }

                // Secondary Variants
                Column(verticalArrangement = Arrangement.spacedBy(GKTheme.spacing.xs)) {
                    Text(text = "Secondary", style = GKTheme.typography.titleSmall)
                    Row(horizontalArrangement = Arrangement.spacedBy(GKTheme.spacing.md)) {
                        GKButton(text = "Enabled", type = ButtonType.SECONDARY, status = ButtonStatus.ENABLED, onClick = {})
                        GKButton(text = "Disabled", type = ButtonType.SECONDARY, status = ButtonStatus.DISABLED, onClick = {})
                        GKButton(text = "Loading", type = ButtonType.SECONDARY, status = ButtonStatus.LOADING, onClick = {})
                    }
                }

                // Outline Variants
                Column(verticalArrangement = Arrangement.spacedBy(GKTheme.spacing.xs)) {
                    Text(text = "Outline", style = GKTheme.typography.titleSmall)
                    Row(horizontalArrangement = Arrangement.spacedBy(GKTheme.spacing.md)) {
                        GKButton(text = "Enabled", type = ButtonType.OUTLINE, status = ButtonStatus.ENABLED, onClick = {})
                        GKButton(text = "Disabled", type = ButtonType.OUTLINE, status = ButtonStatus.DISABLED, onClick = {})
                        GKButton(text = "Loading", type = ButtonType.OUTLINE, status = ButtonStatus.LOADING, onClick = {})
                    }
                }
            }
        }
    }
}
