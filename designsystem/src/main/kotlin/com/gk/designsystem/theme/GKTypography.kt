package com.gk.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// ─────────────────────────────────────────────────────────────────────────────
// Font Families
// ─────────────────────────────────────────────────────────────────────────────
/**
 * Primary font family (Roboto — always available on Android).
 * Replace with a custom font by loading a [FontFamily] from resources:
 *
 *   val MyFont = FontFamily(
 *       Font(R.font.my_font_regular, FontWeight.Normal),
 *       Font(R.font.my_font_bold,    FontWeight.Bold),
 *   )
 */
val GKFontFamilyDefault = FontFamily.Default   // Roboto

/** Mono-spaced family used for code snippets, badges, etc. */
val GKFontFamilyMono    = FontFamily.Monospace

// ─────────────────────────────────────────────────────────────────────────────
// Raw Type Scale — primitive tokens
// ─────────────────────────────────────────────────────────────────────────────
object GKTypeScale {
    // Font sizes (sp)
    val Size10 = 10.sp
    val Size11 = 11.sp
    val Size12 = 12.sp
    val Size14 = 14.sp
    val Size16 = 16.sp
    val Size18 = 18.sp
    val Size20 = 20.sp
    val Size22 = 22.sp
    val Size24 = 24.sp
    val Size28 = 28.sp
    val Size32 = 32.sp
    val Size36 = 36.sp
    val Size45 = 45.sp
    val Size57 = 57.sp

    // Line heights (sp)
    val LineHeight16 = 16.sp
    val LineHeight20 = 20.sp
    val LineHeight24 = 24.sp
    val LineHeight28 = 28.sp
    val LineHeight32 = 32.sp
    val LineHeight36 = 36.sp
    val LineHeight40 = 40.sp
    val LineHeight44 = 44.sp
    val LineHeight52 = 52.sp
    val LineHeight64 = 64.sp

    // Letter spacing (sp)
    val LetterSpacingNeg025  = (-0.25).sp
    val LetterSpacingNeg015  = (-0.15).sp
    val LetterSpacingNone    = 0.sp
    val LetterSpacing01      = 0.1.sp
    val LetterSpacing015     = 0.15.sp
    val LetterSpacing025     = 0.25.sp
    val LetterSpacing04      = 0.4.sp
    val LetterSpacing05      = 0.5.sp
    val LetterSpacing16      = 1.6.sp
}

// ─────────────────────────────────────────────────────────────────────────────
// Semantic Typography Tokens
// ─────────────────────────────────────────────────────────────────────────────
@Immutable
data class GKTypography(
    // Display — largest, expressive text
    val displayLarge: TextStyle,
    val displayMedium: TextStyle,
    val displaySmall: TextStyle,

    // Headline — strong content headings
    val headlineLarge: TextStyle,
    val headlineMedium: TextStyle,
    val headlineSmall: TextStyle,

    // Title — component or section headings
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,

    // Body — long-form reading text
    val bodyLarge: TextStyle,
    val bodyMedium: TextStyle,
    val bodySmall: TextStyle,

    // Label — small, functional text (buttons, chips, captions)
    val labelLarge: TextStyle,
    val labelMedium: TextStyle,
    val labelSmall: TextStyle,

    // Mono — code / technical content
    val monoMedium: TextStyle,
    val monoSmall: TextStyle,
)

// ─────────────────────────────────────────────────────────────────────────────
// Default instance
// ─────────────────────────────────────────────────────────────────────────────
val GKDefaultTypography = GKTypography(
    displayLarge = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Normal,
        fontSize      = GKTypeScale.Size57,
        lineHeight    = GKTypeScale.LineHeight64,
        letterSpacing = GKTypeScale.LetterSpacingNeg025,
    ),
    displayMedium = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Normal,
        fontSize      = GKTypeScale.Size45,
        lineHeight    = GKTypeScale.LineHeight52,
        letterSpacing = GKTypeScale.LetterSpacingNone,
    ),
    displaySmall = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Normal,
        fontSize      = GKTypeScale.Size36,
        lineHeight    = GKTypeScale.LineHeight44,
        letterSpacing = GKTypeScale.LetterSpacingNone,
    ),

    headlineLarge = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.SemiBold,
        fontSize      = GKTypeScale.Size32,
        lineHeight    = GKTypeScale.LineHeight40,
        letterSpacing = GKTypeScale.LetterSpacingNone,
    ),
    headlineMedium = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.SemiBold,
        fontSize      = GKTypeScale.Size28,
        lineHeight    = GKTypeScale.LineHeight36,
        letterSpacing = GKTypeScale.LetterSpacingNone,
    ),
    headlineSmall = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.SemiBold,
        fontSize      = GKTypeScale.Size24,
        lineHeight    = GKTypeScale.LineHeight32,
        letterSpacing = GKTypeScale.LetterSpacingNone,
    ),

    titleLarge = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Medium,
        fontSize      = GKTypeScale.Size22,
        lineHeight    = GKTypeScale.LineHeight28,
        letterSpacing = GKTypeScale.LetterSpacingNone,
    ),
    titleMedium = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Medium,
        fontSize      = GKTypeScale.Size16,
        lineHeight    = GKTypeScale.LineHeight24,
        letterSpacing = GKTypeScale.LetterSpacing015,
    ),
    titleSmall = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Medium,
        fontSize      = GKTypeScale.Size14,
        lineHeight    = GKTypeScale.LineHeight20,
        letterSpacing = GKTypeScale.LetterSpacing01,
    ),

    bodyLarge = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Normal,
        fontSize      = GKTypeScale.Size16,
        lineHeight    = GKTypeScale.LineHeight24,
        letterSpacing = GKTypeScale.LetterSpacing05,
    ),
    bodyMedium = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Normal,
        fontSize      = GKTypeScale.Size14,
        lineHeight    = GKTypeScale.LineHeight20,
        letterSpacing = GKTypeScale.LetterSpacing025,
    ),
    bodySmall = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Normal,
        fontSize      = GKTypeScale.Size12,
        lineHeight    = GKTypeScale.LineHeight16,
        letterSpacing = GKTypeScale.LetterSpacing04,
    ),

    labelLarge = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Medium,
        fontSize      = GKTypeScale.Size14,
        lineHeight    = GKTypeScale.LineHeight20,
        letterSpacing = GKTypeScale.LetterSpacing01,
    ),
    labelMedium = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Medium,
        fontSize      = GKTypeScale.Size12,
        lineHeight    = GKTypeScale.LineHeight16,
        letterSpacing = GKTypeScale.LetterSpacing05,
    ),
    labelSmall = TextStyle(
        fontFamily    = GKFontFamilyDefault,
        fontWeight    = FontWeight.Medium,
        fontSize      = GKTypeScale.Size11,
        lineHeight    = GKTypeScale.LineHeight16,
        letterSpacing = GKTypeScale.LetterSpacing05,
    ),

    monoMedium = TextStyle(
        fontFamily    = GKFontFamilyMono,
        fontWeight    = FontWeight.Normal,
        fontSize      = GKTypeScale.Size14,
        lineHeight    = GKTypeScale.LineHeight20,
        letterSpacing = GKTypeScale.LetterSpacingNone,
    ),
    monoSmall = TextStyle(
        fontFamily    = GKFontFamilyMono,
        fontWeight    = FontWeight.Normal,
        fontSize      = GKTypeScale.Size12,
        lineHeight    = GKTypeScale.LineHeight16,
        letterSpacing = GKTypeScale.LetterSpacingNone,
    ),
)

// ─────────────────────────────────────────────────────────────────────────────
// Material3 Typography bridge (used by MaterialTheme)
// ─────────────────────────────────────────────────────────────────────────────
internal fun GKTypography.toMaterial3Typography() = Typography(
    displayLarge   = displayLarge,
    displayMedium  = displayMedium,
    displaySmall   = displaySmall,
    headlineLarge  = headlineLarge,
    headlineMedium = headlineMedium,
    headlineSmall  = headlineSmall,
    titleLarge     = titleLarge,
    titleMedium    = titleMedium,
    titleSmall     = titleSmall,
    bodyLarge      = bodyLarge,
    bodyMedium     = bodyMedium,
    bodySmall      = bodySmall,
    labelLarge     = labelLarge,
    labelMedium    = labelMedium,
    labelSmall     = labelSmall,
)

// ─────────────────────────────────────────────────────────────────────────────
// CompositionLocal
// ─────────────────────────────────────────────────────────────────────────────
val LocalGKTypography = staticCompositionLocalOf { GKDefaultTypography }


