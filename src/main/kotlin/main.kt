
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*


suspend fun main() {
    GeneratorOfTrucks.generate(1000)
}