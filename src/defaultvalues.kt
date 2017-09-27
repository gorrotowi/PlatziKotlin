fun saluda(saludo: String = "Hola a todos") {
    println(saludo)
}

fun otrafuncion(edad: Int = 0, esAdulto: Boolean = false, tieneRopa: Boolean = true) {

}

data class P1(val a: Int = 2)

fun main(args: Array<String>) {
    saluda("Hola que paso")
    saluda()

    otrafuncion(esAdulto = true, edad = 39, tieneRopa = true)
    otrafuncion(esAdulto = true, tieneRopa = true)
    otrafuncion(esAdulto = true, edad = 39)
    otrafuncion(edad = 39, tieneRopa = true)
    otrafuncion(30, true, false)

    otrafuncion(30, esAdulto = true)

    val objetoO = P1(3)

}