fun main() {
    println("Insert Car Type BMW or Tesla")

    val car1 = BMW("2009", "Green", 120)
    val car2 = Tesla("2020", "Red", 150)
    println("BMW is ${car1.getFuleType()}")
    println("Tesla is ${car2.getFuleType()}")
}

abstract class Car(model: String, color: String, speed: Int) {
    abstract fun getFuleType(): String
}

class BMW(model: String, color: String, speed: Int) : Car(model, color, speed) {
    override fun getFuleType(): String {
        return "Gas type"

    }
}

class Tesla(model: String, color: String, speed: Int) : Car(model, color, speed) {
    override fun getFuleType(): String {
        return "Electric type"

    }
}