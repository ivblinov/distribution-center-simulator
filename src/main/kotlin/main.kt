
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import trucks.MiniTruck
import trucks.Truck
import kotlin.random.Random

/*fun main() {
    repeat(10) {
        println(Random.nextInt(0, 3))
    }


}*/


/*suspend fun main() = coroutineScope{

    val users = getUsers()
    users.consumeEach { user -> println(user) }
    println("End")
}

fun CoroutineScope.getUsers(): ReceiveChannel<String> = produce{
    val users = listOf("Tom", "Bob", "Sam")
    for (user in users) {
        send(user)
        delay(1_000)
    }
}*/

suspend fun main() {
    GeneratorOfTrucks.generate(3_000)
}

/*
suspend fun main() {
    val tasks = Channel<Truck>()
    println(tasks)
    val task = MiniTruck()
    val coroutine = CoroutineScope(Job() + Dispatchers.Default)

    coroutine.launch {
        while (coroutine.isActive) {
            tasks.send(task)
//            val truck = tasks.receive()
//            println(truck)
            println("hi")
        }
    }
    println(tasks)

}
*/

/*
fun main() = runBlocking<Unit> {
    val producer = produceNumbers()
    repeat(5) { launchProcessor(it, producer) }
    delay(950)
    producer.cancel() // cancel producer coroutine and thus kill them all
}

fun CoroutineScope.produceNumbers() = produce<Int> {
    var x = 1 // start from 1
    while (true) {
        send(x++) // produce next
        delay(100) // wait 0.1s
    }
}

fun CoroutineScope.launchProcessor(id: Int, channel: ReceiveChannel<Int>) = launch {
    for (msg in channel) {
        println("Processor #$id received $msg")
    }
}*/
