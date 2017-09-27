fun suma(num: Int, num2: Int, func: (Int) -> Unit) {
    println("Suma de $num y $num2 = ${num + num2}")
    val result = func(num + num2)
}

fun String.funcion(func: String.() -> Unit) {
    //despedazar el strin
    this.func()
    println(this.length)
}


fun main(args: Array<String>) {

//    "Hola".funcion {
//        println(length)
//    }
//
//    with("hola") {
//        println(length)
//    }
//
//    val sum = suma(6, 8) { x ->
//        println("$x")
//    }

}
