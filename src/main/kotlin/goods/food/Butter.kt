package goods.food

import goods.Goods

class Butter : Goods() {
    override val weight: Int = 15
    override val loadingTime: Int = 3
    override val timeOfDischarge: Int = 4
}