package goods.small

import goods.Goods

class Mugs : Goods() {
    override val weight: Int = 7
    override val loadingTime: Int = 5
    override val timeOfDischarge: Int = 4
}