package trucks

import goods.Goods

abstract class Truck {
    abstract val loadCapacity: Int
    val idNumberTruck = ++idNumberCounter
    var currentCargoWeight = 0
    val truckBody = mutableListOf<Goods>()

    companion object {
        var idNumberCounter = 0
    }
}