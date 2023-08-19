package trucks

abstract class Truck {
    abstract val loadCapacity: Int
    val idNumberTruck = ++idNumberCounter
    var currentCargoWeight = 0

    companion object {
        var idNumberCounter = 0
    }
}