data class Tiempo(val years: Int, val days: Int)

operator fun Tiempo.plus(other: Tiempo): Tiempo {
    return Tiempo(this.years + other.years,
            this.days + other.days)
}

data class Contador(private var index: Int) {
    operator fun inc(): Contador {
        return Contador(index + 1)
    }
}

fun main(args: Array<String>) {
    val tiempo1 = Tiempo(2000, 30)
    val tiempo2 = Tiempo(100, 2)

    val sumaDeltiempo = tiempo1 + tiempo2

    println(sumaDeltiempo)

    var contador = Contador(5)
    println(contador.inc())
    println(++contador)


}