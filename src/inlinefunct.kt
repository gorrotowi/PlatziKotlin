inline fun String.filter(predicate: (Char) -> Boolean): String {
    return filterTo(StringBuilder(), predicate).toString()
}

fun main(args: Array<String>) {
    val a = "Hola".filter {
        it == 'h'
    }

    print(a)
}