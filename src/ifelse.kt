fun main(args: Array<String>) {

    val a = esMayor(6)
    defineTipo(Persona2("Mabel", 20, "verdes"))

}

fun esMayor(data: Int): String =
        if (data > 0) {
            println("$data")
            "true"
        } else {
            println("$data")
            "false"
        }

fun defineTipo(data: Any) {
    if (data is String) {
        print(data.length)
    } else if (data is Int) {
        print("${data * 2}")
    } else if (data is Persona2) {
        print(data.name)
    }
}