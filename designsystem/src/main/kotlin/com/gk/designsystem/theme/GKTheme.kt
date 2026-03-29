package com.gk.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import com.gk.designsystem.tokens.GKColorScheme
import com.gk.designsystem.tokens.GKDarkColorScheme
import com.gk.designsystem.tokens.GKDefaultSpacing
import com.gk.designsystem.tokens.GKDefaultTypography
import com.gk.designsystem.tokens.GKLightColorScheme
import com.gk.designsystem.tokens.GKMaterial3DarkColorScheme
import com.gk.designsystem.tokens.GKMaterial3LightColorScheme
import com.gk.designsystem.tokens.GKSpacing
import com.gk.designsystem.tokens.GKTypography
import com.gk.designsystem.tokens.LocalGKColors
import com.gk.designsystem.tokens.LocalGKSpacing
import com.gk.designsystem.tokens.LocalGKTypography
import com.gk.designsystem.tokens.toMaterial3Typography

// ─────────────────────────────────────────────────────────────────────────────
// GKTheme — the single entry point for all design tokens
// ─────────────────────────────────────────────────────────────────────────────
/**
 * Apply the GK Design System theme to [content].
 *
 * @param darkTheme      Whether to use the dark color scheme. Defaults to the
 *                       system setting.
 * @param colors         Override the default [GKColorScheme]. Useful for custom
 *                       branding or white-labelling.
 * @param typography     Override the default [GKTypography].
 * @param spacing        Override the default [GKSpacing].
 * @param content        The composable tree to theme.
 */
@Composable
fun GKTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    colors: GKColorScheme = if (darkTheme) GKDarkColorScheme else GKLightColorScheme,
    typography: GKTypography = GKDefaultTypography,
    spacing: GKSpacing = GKDefaultSpacing,
    content: @Composable () -> Unit,
) {
    val material3Colors = if (darkTheme) GKMaterial3DarkColorScheme else GKMaterial3LightColorScheme

    CompositionLocalProvider(
        LocalGKColors    provides colors,
        LocalGKTypography provides typography,
        LocalGKSpacing   provides spacing,
    ) {
        MaterialTheme(
            colorScheme = material3Colors,
            typography  = typography.toMaterial3Typography(),
            content     = content,
        )
    }
}

// ─────────────────────────────────────────────────────────────────────────────
// Token accessor — use GKTheme.colors / .typography / .spacing anywhere inside
// a GKTheme-wrapped composable tree.
// ─────────────────────────────────────────────────────────────────────────────
object GKTheme {
    /** Current color scheme provided by the nearest [GKTheme]. */
    val colors: GKColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalGKColors.current

    /** Current typography provided by the nearest [GKTheme]. */
    val typography: GKTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalGKTypography.current

    /** Current spacing provided by the nearest [GKTheme]. */
    val spacing: GKSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalGKSpacing.current
}

