package goods.average

import goods.Goods

class Computer : Goods() {
    override val weight: Int = 8
    override val loadingTime: Int = 7
    override val timeOfDischarge: Int = 4
}