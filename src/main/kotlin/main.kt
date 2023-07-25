
import GeneratorOfTrucks.launchProcessor
import GeneratorOfTrucks.produceTruck
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import trucks.BigTruck
import trucks.Truck

suspend fun main() {
}

/*fun main() = runBlocking {
    val producer = produceTruck()
    repeat(5) { launchProcessor(it, producer) }
    delay(950)
    producer.cancel() // cancel producer coroutine and thus kill them all
}*/

/*
@OptIn(ExperimentalCoroutinesApi::class)
fun CoroutineScope.produceTruck() = produce<Truck> {
    while (true) {
        send(BigTruck()) // produce next
        delay(100) // wait 0.1s
    }
}

fun CoroutineScope.launchProcessor(id: Int, channel: ReceiveChannel<Truck>) = launch {
    for (msg in channel) {
        println("Processor #$id received $msg")
    }
}*/
