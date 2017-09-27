data class Familiar(val name: String = "Rodrigo", val age: Int = 24, val colorCabello: String = "Cafe")

data class Result(val result: Int, val status: Boolean)

fun calcular(a: Int, b: Int): Result {
    if (a * 2 > b) {
        return Result(a * 2, true)
    } else {
        return Result(a, false)
    }
}


fun main(args: Array<String>) {
    val (name, _, color) = Familiar()

    println(name)
    println(color)

    val (resultado, estatus) = calcular(4, 9)
    println(resultado)
    println(estatus)

}