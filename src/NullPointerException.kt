fun main(args: Array<String>) {

    var a: String = "abc"

    var b: String? = "abc"
    b = null

    val lA = a.length

    val lB = b?.length ?: 0

    val lC = if (b != null) {
        b.length
    } else {
        0
    }

    println(lA)
    println(lB)

    val persona: Persona2? = Persona2("Sebastian", 24, "cafes")

    val nombre = persona?.name

    if (persona != null) {
        //Salte
    }

    persona?.let {
        //persona inicializada
    }

    persona.let {
        //null
    }

}