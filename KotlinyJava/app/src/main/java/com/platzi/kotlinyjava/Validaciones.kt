package com.platzi.kotlinyjava

import android.widget.EditText

/**
 * @author Gorro
 */

object Validations {

    @JvmStatic
    fun EditText.validatePass(): Boolean = this.text.toString().isNotEmpty() && this.text.toString().length.compareTo(5) == 1

}

fun EditText.passwordValida(): Boolean {
    return this.text.toString().isNotEmpty() &&
            this.text.toString().length.compareTo(6) == 1
}

@JvmName("esMayor")
fun Int.esMayorA(min: Int) = this > min

fun saludarUsuario(nombre: String) {
    println("Bienvenido $nombre")
}