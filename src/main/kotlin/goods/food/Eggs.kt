package goods.food

import goods.Goods

class Eggs : Goods() {
    override val weight: Int = 6
    override val loadingTime: Int = 3
    override val timeOfDischarge: Int = 3
}