package goods.small

import goods.Goods

class Blankets : Goods() {
    override val weight: Int = 4
    override val loadingTime: Int = 2
    override val timeOfDischarge: Int = 2
}