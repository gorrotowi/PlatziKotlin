object Validaciones {
    fun passwordValida(psw: String) = psw.isNotEmpty() && psw.length > 10

    fun esNumero(dato: Any) = dato is Int
}

class ClaseUniversal {
    companion object {
        fun create(): ClaseUniversal = ClaseUniversal()
    }
}

fun main(args: Array<String>) {
    println("Ingresa tu contraseña: ")
    val passw: String = readLine()!!
    println(Validaciones.passwordValida(passw))

    println("Ingresa cualquier cosa: ")
    try {
        val numero: Any = readLine()?.toInt() ?: ""
        println(numero)
        println(Validaciones.esNumero(numero))
    } catch (e: NumberFormatException) {
        print(e)
    }

    val claseUniversalEnMain = ClaseUniversal.create()
}

fun data() {
    val claseUnivData = ClaseUniversal.create()
}