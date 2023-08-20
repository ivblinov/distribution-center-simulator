import kotlin.random.Random

suspend fun main() {
//    GeneratorOfTrucks.generate(3_000)

    val truck = GeneratorOfTrucks.loadTheTruck()
    println("""
        ${truck.idNumberTruck},
        ${truck.truckBody}
        ${truck.currentCargoWeight}
        ${truck.loadCapacity}
    """.trimIndent())
}