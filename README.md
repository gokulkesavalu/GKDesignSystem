# GK Design System

A modern, Jetpack Compose-based design system providing a consistent set of tokens and components.

## Project Structure

- `:designsystem`: The core library containing all tokens, themes, and components.
- `:demo`: A sample application demonstrating the usage of the design system.

## Features

- **Semantic Tokens**: Role-based color schemes, spacing scales, and typography styles.
- **Theme Support**: Built-in support for Light and Dark modes using `GKTheme`.
- **Core Components**:
    - `GKText`: Typography-consistent text component.
    - `GKButton`: Themed button with primary branding.

## Getting Started

### Wrapping your app with GKTheme

To use the design system, wrap your composable hierarchy with `GKTheme`:

```kotlin
GKTheme {
    // Your app content
}
```

### Using Components

#### GKText
```kotlin
GKText(text = "Hello GK Design System")
```

#### GKButton
```kotlin
GKButton(
    text = "Click Me",
    onClick = { /* Handle click */ }
)
```

## Design Tokens

### Colors
The system uses semantic color roles (e.g., `primary`, `onSurface`, `error`) defined in `GKColorScheme`. It automatically switches between `GKLightColorScheme` and `GKDarkColorScheme` based on the system theme.

### Spacing
Spacing is based on a 4dp grid. Use `GKTheme.spacing` to access standardized values:
- `GKTheme.spacing.md` (16dp)
- `GKTheme.spacing.componentPadding` (16dp)

### Typography
Consistent text styles provided via `GKTheme.typography`:
- `displayLarge`, `headlineMedium`, `bodyMedium`, etc.
