package goods.big

import goods.Goods

class Beds : Goods() {
    override val weight: Int = 30
    override val loadingTime: Int = 5
    override val timeOfDischarge: Int = 7
}