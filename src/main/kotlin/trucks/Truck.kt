package trucks

abstract class Truck {
    abstract val loadCapacity: Int
    var currentCargoWeight = 0
}