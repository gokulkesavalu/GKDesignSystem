package com.gk.designsystem.components

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gk.designsystem.theme.GKTheme

/**
 * Defines the visual variants available for [GKCard].
 */
enum class CardVariant {
    /** A subtle filled card with the theme's surface container color. */
    FILLED,

    /** A card with a drop shadow for emphasis. */
    ELEVATED,

    /** A card with an outline and no fill. */
    OUTLINED
}

/**
 * A themed card component that serves as a container for related content.
 *
 * @param modifier The modifier to be applied to the card layout.
 * @param variant The visual variant of the card (Filled, Elevated, or Outlined).
 * @param onClick Optional callback when the card is clicked.
 * @param content The composable content to be displayed inside the card.
 */
@Composable
fun GKCard(
    modifier: Modifier = Modifier,
    variant: CardVariant = CardVariant.FILLED,
    onClick: (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    val colors = GKTheme.colors
    
    when (variant) {
        CardVariant.FILLED -> {
            Card(
                modifier = modifier,
                onClick = onClick ?: {},
                enabled = onClick != null,
                colors = CardDefaults.cardColors(
                    containerColor = colors.surfaceContainer,
                    contentColor = colors.onSurface
                ),
                content = content
            )
        }
        CardVariant.ELEVATED -> {
            ElevatedCard(
                modifier = modifier,
                onClick = onClick ?: {},
                enabled = onClick != null,
                colors = CardDefaults.elevatedCardColors(
                    containerColor = colors.surface,
                    contentColor = colors.onSurface
                ),
                content = content
            )
        }
        CardVariant.OUTLINED -> {
            OutlinedCard(
                modifier = modifier,
                onClick = onClick ?: {},
                enabled = onClick != null,
                colors = CardDefaults.outlinedCardColors(
                    containerColor = colors.surface,
                    contentColor = colors.onSurface
                ),
                border = BorderStroke(1.dp, colors.outlineVariant),
                content = content
            )
        }
    }
}

@Preview(name = "Light Mode", showBackground = true)
@Preview(name = "Dark Mode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GKCardPreview() {
    GKTheme {
        Surface {
            Column(
                modifier = Modifier.padding(GKTheme.spacing.md),
                verticalArrangement = Arrangement.spacedBy(GKTheme.spacing.md)
            ) {
                GKCard(
                    modifier = Modifier.fillMaxWidth(),
                    variant = CardVariant.FILLED
                ) {
                    Column(modifier = Modifier.padding(GKTheme.spacing.md)) {
                        GKText(text = "Filled Card", variant = TextVariant.TITLE_MEDIUM)
                        GKText(text = "Standard surface container background.", variant = TextVariant.BODY_MEDIUM)
                        Spacer(modifier = Modifier.height(GKTheme.spacing.md))
                        GKButton(text = "Action", onClick = {})
                    }
                }

                GKCard(
                    modifier = Modifier.fillMaxWidth(),
                    variant = CardVariant.ELEVATED
                ) {
                    Column(modifier = Modifier.padding(GKTheme.spacing.md)) {
                        GKText(text = "Elevated Card", variant = TextVariant.TITLE_MEDIUM)
                        GKText(text = "Has a subtle shadow for depth.", variant = TextVariant.BODY_MEDIUM)
                        Spacer(modifier = Modifier.height(GKTheme.spacing.md))
                        GKButton(text = "Action", onClick = {}, type = ButtonType.SECONDARY)
                    }
                }

                GKCard(
                    modifier = Modifier.fillMaxWidth(),
                    variant = CardVariant.OUTLINED
                ) {
                    Column(modifier = Modifier.padding(GKTheme.spacing.md)) {
                        GKText(text = "Outlined Card", variant = TextVariant.TITLE_MEDIUM)
                        GKText(text = "Clean border for subtle separation.", variant = TextVariant.BODY_MEDIUM)
                        Spacer(modifier = Modifier.height(GKTheme.spacing.md))
                        GKButton(text = "Action", onClick = {}, type = ButtonType.OUTLINE)
                    }
                }
            }
        }
    }
}
