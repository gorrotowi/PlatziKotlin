data class Auto(var marca: String, private var puertas: Int) {
    var numPuertas = puertas
        get() {
            return if (field > 0) field else 1
        }
}

data class Persona2(var name: String, val age: Int, val colorOjos: String)

fun main(args: Array<String>) {
    val auto = Auto("Ford", 0)


    var marca = auto.marca
//    auto.marca = "Chevr"

    auto.hashCode()
    auto.numPuertas = 3
    println(auto.toString())
    println(auto.numPuertas)

    val mabel = Persona2("Mabel", 24, "Cafes")
    val marla = mabel.copy("Marla")

    println(mabel)
    println(marla)

    println("------------")

    val darla = mabel
    darla.name = "Darla"

    println(mabel)
    println(marla)
    println(darla)

}