package goods.big

import goods.Goods

class Bikes : Goods() {
    override val weight: Int = 18
    override val loadingTime: Int = 3
    override val timeOfDischarge: Int = 4
}