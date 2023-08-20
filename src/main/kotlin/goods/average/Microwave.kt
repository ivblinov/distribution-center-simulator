package goods.average

import goods.Goods

class Microwave : Goods() {
    override val weight: Int = 5
    override val loadingTime: Int = 3
    override val timeOfDischarge: Int = 4
}