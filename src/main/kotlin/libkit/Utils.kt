package libkit

class Utils {
    companion object {
        fun fail(message: String): Nothing =
            throw IllegalArgumentException(message)
    }
}
