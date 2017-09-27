fun main(args: Array<String>) {

    val srt = "Una cadena de String normal"

    val nombre = "Mabel"
    val edad = 25

    val sentencia = "Ella es $nombre y tiene $edad años"

    println(sentencia)

    val cumple = "$nombre cumple ${edad+1}"
    println(cumple)

    val text = """
       >Este es un string que quiero imprimir
        |que es demasiado largo y tiene
        |varios renglones
    """.trimMargin(">")
    println(text)

}