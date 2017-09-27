class Ejemplo {
    fun hola() {
        println("Hola Kotlin")
    }
}

class Persona(val nombre: String) {
    init {
        println("Nombre $nombre")
    }

    constructor(name: String, edad: Int) : this(name) {
        println("Nombre $nombre, edad $edad")
    }
}

open class Base(val inicial: Int) {
    open fun imprimeAlgo() {
        println("Algo $inicial")
    }
}

class General(val d: Int) : Base(d) {
    override fun imprimeAlgo() {
        super.imprimeAlgo()
        val suma = 4 + d
    }
}

fun main(args: Array<String>) {
    val persona = Persona("Rogelio", 30)
    println(persona.toString())
    val general = General(9)
    general.imprimeAlgo()
}