package com.platzi.platzistore

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.jetbrains.anko.db.*

/**
 * @author Gorro.
 */
class DBOpenHelper(ctx: Context) : ManagedSQLiteOpenHelper(ctx, "PlatziStore", null, 1) {

    companion object {
        private var instance: DBOpenHelper? = null

        fun getInstance(ctx: Context): DBOpenHelper? = if (instance == null) {
            instance = DBOpenHelper(ctx)
            instance
        } else {
            instance
        }
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val id = "id" to INTEGER + PRIMARY_KEY
        val name = "name" to TEXT
        val desc = "Desc" to TEXT
        val price = "price" to REAL

        db?.createTable("Productos", true, id, name, desc, price)

    }

    override fun onUpgrade(db: SQLiteDatabase?, old: Int, newV: Int) {
        db?.dropTable("Productos", true)
    }

    val Context.database: DBOpenHelper?
        get() = getInstance(applicationContext)
}