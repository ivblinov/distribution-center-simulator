
import goods.Goods
import goods.average.Computer
import goods.average.Microwave
import goods.average.TV
import goods.big.Beds
import goods.big.Bikes
import goods.big.Furniture
import goods.food.Bread
import goods.food.Butter
import goods.food.Eggs
import goods.small.Blankets
import goods.small.Knives
import goods.small.Mugs
import kotlinx.coroutines.channels.*
import kotlinx.coroutines.*
import trucks.AverageTruck
import trucks.BigTruck
import trucks.MiniTruck
import trucks.Truck
import kotlin.random.Random
import kotlin.reflect.KClass

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

    fun randomGoods() = when (Random.nextInt(0, 12)) {
        0 -> Beds()
        1 -> Bikes()
        2 -> Furniture()
        3 -> Bread()
        4 -> Butter()
        5 -> Eggs()
        6 -> Blankets()
        7 -> Knives()
        8 -> Mugs()
        9 -> Computer()
        10 -> Microwave()
        else -> TV()
    }
}