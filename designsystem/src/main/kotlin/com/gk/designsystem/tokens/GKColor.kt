package com.gk.designsystem.tokens

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// ─────────────────────────────────────────────────────────────────────────────
// Raw Palette — never use these directly in UI; reference semantic tokens below.
// ─────────────────────────────────────────────────────────────────────────────
object GKPalette {

    // Primary – Indigo
    val Primary10  = Color(0xFF00006E)
    val Primary20  = Color(0xFF0001AC)
    val Primary30  = Color(0xFF0000EF)
    val Primary40  = Color(0xFF343DFF)
    val Primary50  = Color(0xFF5B63FF)
    val Primary60  = Color(0xFF7C82FF)
    val Primary70  = Color(0xFF9DA3FF)
    val Primary80  = Color(0xFFBEC2FF)
    val Primary90  = Color(0xFFE0E0FF)
    val Primary95  = Color(0xFFF1EFFF)
    val Primary99  = Color(0xFFFFFBFF)

    // Secondary – Violet
    val Secondary10  = Color(0xFF1E004B)
    val Secondary20  = Color(0xFF370080)
    val Secondary30  = Color(0xFF5300BA)
    val Secondary40  = Color(0xFF6B25D5)
    val Secondary50  = Color(0xFF8646EF)
    val Secondary60  = Color(0xFFA066FF)
    val Secondary70  = Color(0xFFBA88FF)
    val Secondary80  = Color(0xFFD4AAFF)
    val Secondary90  = Color(0xFFECDCFF)
    val Secondary95  = Color(0xFFF8EEFF)
    val Secondary99  = Color(0xFFFFFBFF)

    // Tertiary – Teal
    val Tertiary10  = Color(0xFF00201F)
    val Tertiary20  = Color(0xFF003735)
    val Tertiary30  = Color(0xFF00504E)
    val Tertiary40  = Color(0xFF006B68)
    val Tertiary50  = Color(0xFF008784)
    val Tertiary60  = Color(0xFF00A3A0)
    val Tertiary70  = Color(0xFF00C1BC)
    val Tertiary80  = Color(0xFF00DDDA)
    val Tertiary90  = Color(0xFF9CF4F0)
    val Tertiary95  = Color(0xFFCCFAF8)
    val Tertiary99  = Color(0xFFF3FFFF)

    // Error – Red
    val Error10  = Color(0xFF410002)
    val Error20  = Color(0xFF690005)
    val Error30  = Color(0xFF93000A)
    val Error40  = Color(0xFFB3261E)
    val Error50  = Color(0xFFCC4F42)
    val Error60  = Color(0xFFE2685E)
    val Error70  = Color(0xFFF28980)
    val Error80  = Color(0xFFFFB4AB)
    val Error90  = Color(0xFFFFDAD6)
    val Error95  = Color(0xFFFFEDEA)
    val Error99  = Color(0xFFFFFBFF)

    // Success – Green
    val Success10  = Color(0xFF002111)
    val Success20  = Color(0xFF003920)
    val Success30  = Color(0xFF005231)
    val Success40  = Color(0xFF006D42)
    val Success50  = Color(0xFF008A53)
    val Success60  = Color(0xFF00A868)
    val Success70  = Color(0xFF2DC47F)
    val Success80  = Color(0xFF5BE098)
    val Success90  = Color(0xFF78FFB2)
    val Success95  = Color(0xFFBBFFD7)

    // Warning – Amber
    val Warning10  = Color(0xFF261A00)
    val Warning20  = Color(0xFF402D00)
    val Warning30  = Color(0xFF5E4200)
    val Warning40  = Color(0xFF7D5700)
    val Warning50  = Color(0xFF9D6E00)
    val Warning60  = Color(0xFFBF8700)
    val Warning70  = Color(0xFFE2A100)
    val Warning80  = Color(0xFFFFB940)
    val Warning90  = Color(0xFFFFDEA0)
    val Warning95  = Color(0xFFFFEFCF)

    // Neutral — shades of gray
    val Neutral0   = Color(0xFF000000)
    val Neutral4   = Color(0xFF0D0E11)
    val Neutral6   = Color(0xFF121317)
    val Neutral10  = Color(0xFF1B1B1F)
    val Neutral12  = Color(0xFF1F1F23)
    val Neutral17  = Color(0xFF2A2A2E)
    val Neutral20  = Color(0xFF303034)
    val Neutral22  = Color(0xFF353539)
    val Neutral24  = Color(0xFF393940)
    val Neutral30  = Color(0xFF47474B)
    val Neutral40  = Color(0xFF5E5E62)
    val Neutral50  = Color(0xFF77777A)
    val Neutral60  = Color(0xFF909094)
    val Neutral70  = Color(0xFFABABAE)
    val Neutral80  = Color(0xFFC7C6CA)
    val Neutral87  = Color(0xFFDBDADE)
    val Neutral90  = Color(0xFFE3E2E6)
    val Neutral92  = Color(0xFFE9E8EC)
    val Neutral94  = Color(0xFFEFEEF1)
    val Neutral95  = Color(0xFFF2F0F4)
    val Neutral96  = Color(0xFFF4F3F7)
    val Neutral98  = Color(0xFFFAF9FD)
    val Neutral99  = Color(0xFFFFFBFF)
    val Neutral100 = Color(0xFFFFFFFF)

    // Neutral Variant
    val NeutralVariant10  = Color(0xFF1B1B23)
    val NeutralVariant20  = Color(0xFF303039)
    val NeutralVariant30  = Color(0xFF46464F)
    val NeutralVariant40  = Color(0xFF5E5E67)
    val NeutralVariant50  = Color(0xFF777680)
    val NeutralVariant60  = Color(0xFF918F9A)
    val NeutralVariant70  = Color(0xFFABABB4)
    val NeutralVariant80  = Color(0xFFC7C5D0)
    val NeutralVariant90  = Color(0xFFE3E1EC)
    val NeutralVariant95  = Color(0xFFF1EFFA)
    val NeutralVariant99  = Color(0xFFFFFBFF)
}

// ─────────────────────────────────────────────────────────────────────────────
// Semantic Color Tokens — role-based, consumed by components and the theme.
// ─────────────────────────────────────────────────────────────────────────────
@Immutable
data class GKColorScheme(
    // Brand
    val primary: Color,
    val onPrimary: Color,
    val primaryContainer: Color,
    val onPrimaryContainer: Color,

    val secondary: Color,
    val onSecondary: Color,
    val secondaryContainer: Color,
    val onSecondaryContainer: Color,

    val tertiary: Color,
    val onTertiary: Color,
    val tertiaryContainer: Color,
    val onTertiaryContainer: Color,

    // Feedback
    val error: Color,
    val onError: Color,
    val errorContainer: Color,
    val onErrorContainer: Color,

    val success: Color,
    val onSuccess: Color,
    val successContainer: Color,
    val onSuccessContainer: Color,

    val warning: Color,
    val onWarning: Color,
    val warningContainer: Color,
    val onWarningContainer: Color,

    // Background / Surface
    val background: Color,
    val onBackground: Color,

    val surface: Color,
    val onSurface: Color,
    val surfaceVariant: Color,
    val onSurfaceVariant: Color,
    val surfaceContainer: Color,
    val surfaceContainerHigh: Color,
    val surfaceContainerHighest: Color,
    val surfaceContainerLow: Color,
    val surfaceContainerLowest: Color,
    val inverseSurface: Color,
    val inverseOnSurface: Color,
    val inversePrimary: Color,

    // Outline
    val outline: Color,
    val outlineVariant: Color,

    // Scrim / overlay
    val scrim: Color,

    // State layers
    val disabledContent: Color,
    val disabledContainer: Color,

    val isLight: Boolean,
)

// ─────────────────────────────────────────────────────────────────────────────
// Light scheme
// ─────────────────────────────────────────────────────────────────────────────
val GKLightColorScheme = GKColorScheme(
    primary              = GKPalette.Primary40,
    onPrimary            = GKPalette.Neutral100,
    primaryContainer     = GKPalette.Primary90,
    onPrimaryContainer   = GKPalette.Primary10,

    secondary            = GKPalette.Secondary40,
    onSecondary          = GKPalette.Neutral100,
    secondaryContainer   = GKPalette.Secondary90,
    onSecondaryContainer = GKPalette.Secondary10,

    tertiary             = GKPalette.Tertiary40,
    onTertiary           = GKPalette.Neutral100,
    tertiaryContainer    = GKPalette.Tertiary90,
    onTertiaryContainer  = GKPalette.Tertiary10,

    error                = GKPalette.Error40,
    onError              = GKPalette.Neutral100,
    errorContainer       = GKPalette.Error90,
    onErrorContainer     = GKPalette.Error10,

    success              = GKPalette.Success40,
    onSuccess            = GKPalette.Neutral100,
    successContainer     = GKPalette.Success90,
    onSuccessContainer   = GKPalette.Success10,

    warning              = GKPalette.Warning40,
    onWarning            = GKPalette.Neutral100,
    warningContainer     = GKPalette.Warning90,
    onWarningContainer   = GKPalette.Warning10,

    background           = GKPalette.Neutral99,
    onBackground         = GKPalette.Neutral10,

    surface                    = GKPalette.Neutral99,
    onSurface                  = GKPalette.Neutral10,
    surfaceVariant             = GKPalette.NeutralVariant90,
    onSurfaceVariant           = GKPalette.NeutralVariant30,
    surfaceContainer           = GKPalette.Neutral94,
    surfaceContainerHigh       = GKPalette.Neutral92,
    surfaceContainerHighest    = GKPalette.Neutral90,
    surfaceContainerLow        = GKPalette.Neutral96,
    surfaceContainerLowest     = GKPalette.Neutral100,
    inverseSurface             = GKPalette.Neutral20,
    inverseOnSurface           = GKPalette.Neutral95,
    inversePrimary             = GKPalette.Primary80,

    outline                    = GKPalette.NeutralVariant50,
    outlineVariant             = GKPalette.NeutralVariant80,

    scrim                      = GKPalette.Neutral0,

    disabledContent            = GKPalette.Neutral40.copy(alpha = 0.38f),
    disabledContainer          = GKPalette.Neutral10.copy(alpha = 0.12f),

    isLight = true,
)

// ─────────────────────────────────────────────────────────────────────────────
// Dark scheme
// ─────────────────────────────────────────────────────────────────────────────
val GKDarkColorScheme = GKColorScheme(
    primary              = GKPalette.Primary80,
    onPrimary            = GKPalette.Primary20,
    primaryContainer     = GKPalette.Primary30,
    onPrimaryContainer   = GKPalette.Primary90,

    secondary            = GKPalette.Secondary80,
    onSecondary          = GKPalette.Secondary20,
    secondaryContainer   = GKPalette.Secondary30,
    onSecondaryContainer = GKPalette.Secondary90,

    tertiary             = GKPalette.Tertiary80,
    onTertiary           = GKPalette.Tertiary20,
    tertiaryContainer    = GKPalette.Tertiary30,
    onTertiaryContainer  = GKPalette.Tertiary90,

    error                = GKPalette.Error80,
    onError              = GKPalette.Error20,
    errorContainer       = GKPalette.Error30,
    onErrorContainer     = GKPalette.Error90,

    success              = GKPalette.Success80,
    onSuccess            = GKPalette.Success20,
    successContainer     = GKPalette.Success30,
    onSuccessContainer   = GKPalette.Success90,

    warning              = GKPalette.Warning80,
    onWarning            = GKPalette.Warning20,
    warningContainer     = GKPalette.Warning30,
    onWarningContainer   = GKPalette.Warning90,

    background           = GKPalette.Neutral10,
    onBackground         = GKPalette.Neutral90,

    surface                    = GKPalette.Neutral10,
    onSurface                  = GKPalette.Neutral90,
    surfaceVariant             = GKPalette.NeutralVariant30,
    onSurfaceVariant           = GKPalette.NeutralVariant80,
    surfaceContainer           = GKPalette.Neutral17,
    surfaceContainerHigh       = GKPalette.Neutral22,
    surfaceContainerHighest    = GKPalette.Neutral24,
    surfaceContainerLow        = GKPalette.Neutral12,
    surfaceContainerLowest     = GKPalette.Neutral4,
    inverseSurface             = GKPalette.Neutral90,
    inverseOnSurface           = GKPalette.Neutral20,
    inversePrimary             = GKPalette.Primary40,

    outline                    = GKPalette.NeutralVariant60,
    outlineVariant             = GKPalette.NeutralVariant30,

    scrim                      = GKPalette.Neutral0,

    disabledContent            = GKPalette.Neutral60.copy(alpha = 0.38f),
    disabledContainer          = GKPalette.Neutral100.copy(alpha = 0.12f),

    isLight = false,
)

// ─────────────────────────────────────────────────────────────────────────────
// Material3 color schemes (used by MaterialTheme)
// ─────────────────────────────────────────────────────────────────────────────
internal val GKMaterial3LightColorScheme = lightColorScheme(
    primary              = GKPalette.Primary40,
    onPrimary            = GKPalette.Neutral100,
    primaryContainer     = GKPalette.Primary90,
    onPrimaryContainer   = GKPalette.Primary10,
    secondary            = GKPalette.Secondary40,
    onSecondary          = GKPalette.Neutral100,
    secondaryContainer   = GKPalette.Secondary90,
    onSecondaryContainer = GKPalette.Secondary10,
    tertiary             = GKPalette.Tertiary40,
    onTertiary           = GKPalette.Neutral100,
    tertiaryContainer    = GKPalette.Tertiary90,
    onTertiaryContainer  = GKPalette.Tertiary10,
    error                = GKPalette.Error40,
    onError              = GKPalette.Neutral100,
    errorContainer       = GKPalette.Error90,
    onErrorContainer     = GKPalette.Error10,
    background           = GKPalette.Neutral99,
    onBackground         = GKPalette.Neutral10,
    surface              = GKPalette.Neutral99,
    onSurface            = GKPalette.Neutral10,
    surfaceVariant       = GKPalette.NeutralVariant90,
    onSurfaceVariant     = GKPalette.NeutralVariant30,
    outline              = GKPalette.NeutralVariant50,
    outlineVariant       = GKPalette.NeutralVariant80,
    scrim                = GKPalette.Neutral0,
    inverseSurface       = GKPalette.Neutral20,
    inverseOnSurface     = GKPalette.Neutral95,
    inversePrimary       = GKPalette.Primary80,
)

internal val GKMaterial3DarkColorScheme = darkColorScheme(
    primary              = GKPalette.Primary80,
    onPrimary            = GKPalette.Primary20,
    primaryContainer     = GKPalette.Primary30,
    onPrimaryContainer   = GKPalette.Primary90,
    secondary            = GKPalette.Secondary80,
    onSecondary          = GKPalette.Secondary20,
    secondaryContainer   = GKPalette.Secondary30,
    onSecondaryContainer = GKPalette.Secondary90,
    tertiary             = GKPalette.Tertiary80,
    onTertiary           = GKPalette.Tertiary20,
    tertiaryContainer    = GKPalette.Tertiary30,
    onTertiaryContainer  = GKPalette.Tertiary90,
    error                = GKPalette.Error80,
    onError              = GKPalette.Error20,
    errorContainer       = GKPalette.Error30,
    onErrorContainer     = GKPalette.Error90,
    background           = GKPalette.Neutral10,
    onBackground         = GKPalette.Neutral90,
    surface              = GKPalette.Neutral10,
    onSurface            = GKPalette.Neutral90,
    surfaceVariant       = GKPalette.NeutralVariant30,
    onSurfaceVariant     = GKPalette.NeutralVariant80,
    outline              = GKPalette.NeutralVariant60,
    outlineVariant       = GKPalette.NeutralVariant30,
    scrim                = GKPalette.Neutral0,
    inverseSurface       = GKPalette.Neutral90,
    inverseOnSurface     = GKPalette.Neutral20,
    inversePrimary       = GKPalette.Primary40,
)

// ─────────────────────────────────────────────────────────────────────────────
// CompositionLocal
// ─────────────────────────────────────────────────────────────────────────────
val LocalGKColors = staticCompositionLocalOf { GKLightColorScheme }

