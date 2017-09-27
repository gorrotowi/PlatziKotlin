sealed class Intencion {
    object Recargar : Intencion() {
        override fun log() {
            println("Refrescando")
        }
    }

    object CargarMasDatos : Intencion() {
        override fun log() {
            println("Cargar mas datos")
        }
    }

    data class Error(val razon: String) : Intencion() {
        override fun log() {
            println("$razon")
        }
    }

    abstract fun log()

}

fun main(args: Array<String>) {
    val intencion: Intencion = Intencion.Recargar
    val output = when (intencion) {
        is Intencion.CargarMasDatos -> "Carga mas datos"
        is Intencion.Recargar -> "Recargar datos"
        is Intencion.Error -> "Error"
    }

    intencion.log()

    print(output)
}