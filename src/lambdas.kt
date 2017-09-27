data class Auto(val color: String, val llantas: Int, val puertas: Int)

fun main(args: Array<String>) {

    val miAuto: Auto? = Auto("Rojo", 4, 4)

    miAuto?.let {
        miAuto.puertas
        it.puertas
        with(it) {
            puertas
            color
            llantas
        }
    }


    val resultado = sum(4, 7)
    val resultadoMinCuatro = minCuatro("Hola!!!")

    println(resultado)
    println(resultadoMinCuatro)

}

val sum: (Int, Int) -> Int = { x, y -> x + y }

val minCuatro: (String) -> Boolean = { it.length > 4 }

