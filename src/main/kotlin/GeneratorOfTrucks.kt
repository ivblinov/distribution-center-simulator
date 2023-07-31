
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
        coroutineScope.launch {
            val producer = produceTruck(interval)
            while (true) {
                producer
                delay(2000)
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
        val trucks = arrayOf(AverageTruck(), BigTruck(), MiniTruck())
        return trucks[Random.nextInt(0, 3)]
    }
}