package com.gk.designsystem.tokens

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// ─────────────────────────────────────────────────────────────────────────────
// Raw Spacing Scale — 4 dp base grid
//
//  Step  │  dp  │ Usage hint
//  ──────┼──────┼──────────────────────────────────────────────────────────────
//  none  │   0  │ No spacing
//  4xs   │   2  │ Hairline gaps, icon-to-label micro nudge
//  3xs   │   4  │ Icon padding, tight inline gaps
//  2xs   │   6  │ Tight list item padding
//  xs    │   8  │ Small padding, chip/badge inner
//  sm    │  12  │ Card inner padding (compact)
//  md    │  16  │ Standard component padding (most common)
//  lg    │  20  │ Section inner padding
//  xl    │  24  │ Card inner padding (comfortable)
//  2xl   │  32  │ Section spacing
//  3xl   │  40  │ Screen horizontal margins (narrow)
//  4xl   │  48  │ Screen horizontal margins (normal)
//  5xl   │  56  │ Large section separators
//  6xl   │  64  │ Hero / illustration padding
//  7xl   │  80  │ Display-level vertical rhythm
//  8xl   │  96  │ Large layout gaps
//  9xl   │ 128  │ Extra-large layout gaps
// ─────────────────────────────────────────────────────────────────────────────
@Immutable
data class GKSpacing(
    val none : Dp =   0.dp,
    val xs4  : Dp =   2.dp,   // 4xs
    val xs3  : Dp =   4.dp,   // 3xs
    val xs2  : Dp =   6.dp,   // 2xs
    val xs   : Dp =   8.dp,
    val sm   : Dp =  12.dp,
    val md   : Dp =  16.dp,
    val lg   : Dp =  20.dp,
    val xl   : Dp =  24.dp,
    val xl2  : Dp =  32.dp,
    val xl3  : Dp =  40.dp,
    val xl4  : Dp =  48.dp,
    val xl5  : Dp =  56.dp,
    val xl6  : Dp =  64.dp,
    val xl7  : Dp =  80.dp,
    val xl8  : Dp =  96.dp,
    val xl9  : Dp = 128.dp,
)

// ─────────────────────────────────────────────────────────────────────────────
// Named aliases for semantic usage
// ─────────────────────────────────────────────────────────────────────────────
/** Standard inner padding for most components (16 dp). */
inline val GKSpacing.componentPadding    get() = md

/** Inner padding for compact/dense components (8 dp). */
inline val GKSpacing.componentPaddingXs  get() = xs

/** Comfortable card inner padding (24 dp). */
inline val GKSpacing.cardPadding         get() = xl

/** Standard horizontal screen margin (16 dp). */
inline val GKSpacing.screenHorizontal    get() = md

/** Standard vertical screen margin (24 dp). */
inline val GKSpacing.screenVertical      get() = xl

/** Space between list items (8 dp). */
inline val GKSpacing.listItemGap         get() = xs

/** Space between card items in a grid (16 dp). */
inline val GKSpacing.gridGap             get() = md

/** Vertical gap between sections (32 dp). */
inline val GKSpacing.sectionGap          get() = xl2

/** Icon size hint — small (16 dp). */
inline val GKSpacing.iconSmall           get() = md

/** Icon size hint — medium (24 dp). */
inline val GKSpacing.iconMedium          get() = xl

/** Icon size hint — large (32 dp). */
inline val GKSpacing.iconLarge           get() = xl2

// ─────────────────────────────────────────────────────────────────────────────
// Singleton default instance
// ─────────────────────────────────────────────────────────────────────────────
val GKDefaultSpacing = GKSpacing()

// ─────────────────────────────────────────────────────────────────────────────
// CompositionLocal
// ─────────────────────────────────────────────────────────────────────────────
val LocalGKSpacing = staticCompositionLocalOf { GKDefaultSpacing }

