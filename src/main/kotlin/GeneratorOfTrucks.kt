
import kotlinx.coroutines.channels.*
import kotlinx.coroutines.*
import trucks.AverageTruck
import trucks.BigTruck
import trucks.MiniTruck
import trucks.Truck
import kotlin.random.Random

object GeneratorOfTrucks {
    suspend fun generate(interval: Long) {
        val coroutineContext = Dispatchers.IO + Job()
        val coroutineScope = CoroutineScope(coroutineContext)

        coroutineScope {
            val producer = produceTruck(interval)
            repeat(3) {
                launchProcessor(it, producer)
            }
        }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    fun CoroutineScope.produceTruck(interval: Long) = produce {
        while (true) {
            send(randomTruck())
            delay(interval)
        }
    }

    private fun randomTruck(): Truck {
        return when (Random.nextInt(0, 3)) {
            0 -> BigTruck()
            1 -> AverageTruck()
            else -> MiniTruck()
        }
    }

    private fun CoroutineScope.launchProcessor(id: Int, channel: ReceiveChannel<Truck>) = launch {
        channel.consumeEach { truck ->
            println("Truck № $id - ${truck.idNumberTruck}")
        }
    }
}