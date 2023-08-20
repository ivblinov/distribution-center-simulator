package goods.average

import goods.Goods

class TV : Goods() {
    override val weight: Int = 10
    override val loadingTime: Int = 4
    override val timeOfDischarge: Int = 6
}