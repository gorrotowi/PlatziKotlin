fun type(dato: Any) {
    when (dato) {
        is String -> {
            print(dato.length)
        }
        is Int -> print("${dato * 2}")
        is Boolean -> {
            println("Es un boleando")
            print(dato)
        }
        is Persona2 -> print("${dato.name} ${dato.age}")
        else -> print("No se que objeto es")
    }
}

fun whoIs(persona: Persona2) =
        when (persona.name) {
            "Mabel", "Darla", "Raul" -> "Puedes abrir la puerta"
            else -> "corre de la casa!"
        }

fun rango(numero: Int) {
    when (numero) {
        in 1..10 -> print("Este es un numero positivo entre 1 y 10")
        in 10..100 -> print("Este es un numero positivo entre 10 y 100")
        else -> print("Este es un numero fuera del rango definido")
    }
}

fun main(args: Array<String>) {
    type("Sebastian")

    val mabel = Persona2("Mabel", 40, "Cafes")
    val desconocido = Persona2("Asesino", 23, "Cafes")

    println(whoIs(mabel))
    println(whoIs(desconocido))

    rango(80)

}