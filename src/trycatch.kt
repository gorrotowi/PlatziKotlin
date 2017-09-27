fun esNumero(dato: Any?) = dato is Int || dato is Int?

fun fail(mensaje: String): Nothing {
    throw IllegalArgumentException(mensaje)
}

fun main(args: Array<String>) {

//    println("Ingresa cualquier cosa: ")
//
//    val num: Any? = try {
//        readLine()?.toInt()
//    } catch (e: NumberFormatException) {
//        "No Int"
//    }
//
//    print("Variable: ")
//    println(num)
//    print("Funcion: ")
//    print(esNumero(num))

    var name = ""
    val persona: PersonaKT? = null
    try {
        name = persona?.nombre ?: fail("Nombre Requerido")
    } catch (e: IllegalArgumentException) {
        println(e)
        println(name)
    }

}