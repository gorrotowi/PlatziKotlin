package com.platzi.kotlinyjava

import android.content.SharedPreferences

/**
 * @author Gorro
 */

fun SharedPreferences.edit(func: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.func()
    editor.apply()
}