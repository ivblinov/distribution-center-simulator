package goods.small

import goods.Goods

class Knives : Goods() {
    override val weight: Int = 6
    override val loadingTime: Int = 3
    override val timeOfDischarge: Int = 4
}