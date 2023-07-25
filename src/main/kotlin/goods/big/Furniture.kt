package goods.big

import goods.Goods

class Furniture : Goods() {
    override val weight: Int = 25
    override val loadingTime: Int = 4
    override val timeOfDischarge: Int = 5
}