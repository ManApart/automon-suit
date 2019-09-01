import org.hexworks.zircon.api.extensions.handleKeyboardEvents
import org.hexworks.zircon.api.uievent.*

class ControlManager(inputComponent: UIEventSource) {
    init {
        inputComponent.handleKeyboardEvents(KeyboardEventType.KEY_PRESSED) { event, _ ->
            when(event.code) {
                KeyCode.UP -> player.attemptMove(0, -1)
                KeyCode.DOWN -> player.attemptMove(0, 1)
                KeyCode.LEFT -> player.attemptMove(-1, 0)
                KeyCode.RIGHT -> player.attemptMove(1, 0)
                else -> Pass
            }
            Processed
        }
    }
}