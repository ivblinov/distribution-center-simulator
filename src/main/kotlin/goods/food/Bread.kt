package goods.food

import goods.Goods

class Bread : Goods() {
    override val weight: Int = 8
    override val loadingTime: Int = 2
    override val timeOfDischarge: Int = 3
}