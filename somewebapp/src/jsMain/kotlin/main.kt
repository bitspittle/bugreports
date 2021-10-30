import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

// COMMENT THIS OUT AND THINGS COMPILE AGAIN:
object OverriddenLinkStyle : LinkStyle {
    @Composable
    override fun toModifier(state: LinkState): Modifier {
        TODO()
    }
}

fun main() {
    renderComposable(rootElementId = "root") {
        Text("Placeholder")
    }
}