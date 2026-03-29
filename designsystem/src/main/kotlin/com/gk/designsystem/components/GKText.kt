package com.gk.designsystem.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.gk.designsystem.theme.GKTheme
import com.gk.designsystem.tokens.componentPadding

/**
 * Defines the typography variants available for [GKText].
 */
enum class TextVariant {
    DISPLAY_LARGE, DISPLAY_MEDIUM, DISPLAY_SMALL,
    HEADLINE_LARGE, HEADLINE_MEDIUM, HEADLINE_SMALL,
    TITLE_LARGE, TITLE_MEDIUM, TITLE_SMALL,
    BODY_LARGE, BODY_MEDIUM, BODY_SMALL,
    LABEL_LARGE, LABEL_MEDIUM, LABEL_SMALL,
    MONO_MEDIUM, MONO_SMALL
}

/**
 * A themed text component that automatically applies the GK Design System typography and color.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the text layout.
 * @param variant The typography style variant to apply. Defaults to [TextVariant.BODY_MEDIUM].
 * @param color The color to be applied to the text. Defaults to the theme's onSurface color.
 * @param textAlign The alignment of the text within the lines of the paragraph.
 * @param overflow How visual overflow should be handled.
 * @param softWrap Whether the text should break at soft line breaks.
 * @param maxLines An optional maximum number of lines for the text to span, wrapping if necessary.
 * @param minLines The minimum height in terms of number of lines.
 * @param fontWeight The thickness of the glyphs.
 * @param textDecoration The decorations to paint on the text (e.g., underline).
 * @param fontStyle The typeface variant to use (e.g., italic).
 * @param lineHeight The height of a line of text.
 * @param letterSpacing The amount of space to add between each letter.
 */
@Composable
fun GKText(
    text: String,
    modifier: Modifier = Modifier,
    variant: TextVariant = TextVariant.BODY_MEDIUM,
    color: Color = GKTheme.colors.onSurface,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    fontWeight: FontWeight? = null,
    textDecoration: TextDecoration? = null,
    fontStyle: FontStyle? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    letterSpacing: TextUnit = TextUnit.Unspecified,
) {
    val style = getTextStyle(variant)
    Text(
        text = text,
        modifier = modifier,
        style = style,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        fontWeight = fontWeight,
        textDecoration = textDecoration,
        fontStyle = fontStyle,
        lineHeight = lineHeight,
        letterSpacing = letterSpacing,
    )
}

/**
 * A themed text component that accepts [AnnotatedString] and applies the GK Design System typography.
 */
@Composable
fun GKText(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    variant: TextVariant = TextVariant.BODY_MEDIUM,
    color: Color = GKTheme.colors.onSurface,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    fontWeight: FontWeight? = null,
    textDecoration: TextDecoration? = null,
    fontStyle: FontStyle? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    letterSpacing: TextUnit = TextUnit.Unspecified,
) {
    val style = getTextStyle(variant)
    Text(
        text = text,
        modifier = modifier,
        style = style,
        color = color,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        fontWeight = fontWeight,
        textDecoration = textDecoration,
        fontStyle = fontStyle,
        lineHeight = lineHeight,
        letterSpacing = letterSpacing,
    )
}

@Composable
private fun getTextStyle(variant: TextVariant): TextStyle {
    return when (variant) {
        TextVariant.DISPLAY_LARGE -> GKTheme.typography.displayLarge
        TextVariant.DISPLAY_MEDIUM -> GKTheme.typography.displayMedium
        TextVariant.DISPLAY_SMALL -> GKTheme.typography.displaySmall
        TextVariant.HEADLINE_LARGE -> GKTheme.typography.headlineLarge
        TextVariant.HEADLINE_MEDIUM -> GKTheme.typography.headlineMedium
        TextVariant.HEADLINE_SMALL -> GKTheme.typography.headlineSmall
        TextVariant.TITLE_LARGE -> GKTheme.typography.titleLarge
        TextVariant.TITLE_MEDIUM -> GKTheme.typography.titleMedium
        TextVariant.TITLE_SMALL -> GKTheme.typography.titleSmall
        TextVariant.BODY_LARGE -> GKTheme.typography.bodyLarge
        TextVariant.BODY_MEDIUM -> GKTheme.typography.bodyMedium
        TextVariant.BODY_SMALL -> GKTheme.typography.bodySmall
        TextVariant.LABEL_LARGE -> GKTheme.typography.labelLarge
        TextVariant.LABEL_MEDIUM -> GKTheme.typography.labelMedium
        TextVariant.LABEL_SMALL -> GKTheme.typography.labelSmall
        TextVariant.MONO_MEDIUM -> GKTheme.typography.monoMedium
        TextVariant.MONO_SMALL -> GKTheme.typography.monoSmall
    }
}

@Preview(name = "Light Mode", showBackground = true)
@Preview(name = "Dark Mode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GKTextPreview() {
    GKTheme {
        Surface {
            Column(
                modifier = Modifier.padding(GKTheme.spacing.componentPadding),
                verticalArrangement = Arrangement.spacedBy(GKTheme.spacing.xs)
            ) {
                GKText(text = "Display Large", variant = TextVariant.DISPLAY_LARGE)
                GKText(
                    text = "Bold Underlined Headline",
                    variant = TextVariant.HEADLINE_MEDIUM,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline
                )
                GKText(text = "Italic Title", variant = TextVariant.TITLE_SMALL, fontStyle = FontStyle.Italic)
                GKText(text = "Body Medium", variant = TextVariant.BODY_MEDIUM)
                GKText(
                    text = "Center Aligned Body Small with Max Lines 1 and Ellipsis overflow. This text is long enough to wrap.",
                    variant = TextVariant.BODY_SMALL,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                GKText(text = "Mono Medium", variant = TextVariant.MONO_MEDIUM)
            }
        }
    }
}
