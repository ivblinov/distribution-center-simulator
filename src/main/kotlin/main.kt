
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

suspend fun main() {
    val generator = GeneratorOfTrucks.generate()
}