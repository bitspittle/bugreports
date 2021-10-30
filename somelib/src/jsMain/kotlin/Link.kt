import androidx.compose.runtime.Composable

enum class LinkState : ComponentState {
    DEFAULT,
    HOVER,
}

interface LinkStyle : ComponentStyle<LinkState>
object DefaultLinkStyle : LinkStyle {
    @Composable
    override fun toModifier(state: LinkState): Modifier = TODO()
}

object LinkKey : ComponentKey<LinkStyle>
interface LinkVariant : ComponentVariant<LinkState, LinkStyle>