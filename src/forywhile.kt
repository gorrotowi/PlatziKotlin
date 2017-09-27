fun main(args: Array<String>) {
    val listaNumeros = intArrayOf(1, 2, 3, 4, 5, 6)

    for (i in listaNumeros.indices) {
        print(listaNumeros[i])
    }

    val frutas = listOf("manzana", "piña", "uva", "platano")
    for (fruta in frutas) {
        println(fruta)
    }

    var x = 3
    while (x > 0) {
        x--
        println(x)
    }

    var sum: Int = 0
    var input: String? = ""
    do {
        print("Ingresa un numero: ")
        input = readLine()
        sum += input?.toInt() ?: 0
    } while (input != "0")

    println("La suma es: $sum")

}