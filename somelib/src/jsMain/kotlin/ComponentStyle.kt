import androidx.compose.runtime.Composable

interface Modifier
interface ComponentKey<S : ComponentStyle<*>>
interface ComponentState
interface ComponentStyle<T : ComponentState> {
    @Composable
    fun toModifier(state: T): Modifier
}
interface ComponentVariant<T : ComponentState, S : ComponentStyle<T>> {
    val style: S
}