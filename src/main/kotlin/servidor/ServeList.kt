package servidor

import com.google.gson.GsonBuilder
import org.jetbrains.ktor.http.ContentType
import org.jetbrains.ktor.http.HttpMethod
import org.jetbrains.ktor.http.HttpStatusCode
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.Route
import org.jetbrains.ktor.routing.route

fun Route.listProducts() {
    route(HttpMethod.Get, "/list") {

        val productos = mutableListOf<Producto>()
        (0..20).map {
            productos.add(Producto((Math.random() * 1000).toInt(),
                    "Jacket",
                    "Jacket para el frio",
                    "ADSFasdfkjahsdgkjasfkbjasdgkbj",
                    200.00 + it,
                    "http://10.0.3.2:5000/img/jacket.jpg"))

            productos.add(Producto((Math.random() * 1000).toInt(),
                    "Hoddie",
                    "Hoddie para verte super cool",
                    "ADSFasdfkjahsdgkjasfkbjasdgkbj",
                    200.00 + it,
                    "http://10.0.3.2:5000/img/hoodie.jpg"))

            productos.add(Producto((Math.random() * 1000).toInt(),
                    "Taza Platzi",
                    "Despierta de Buenas todos los dias",
                    "ADSFasdfkjahsdgkjasfkbjasdgkbj",
                    200.00 + it,
                    "http://10.0.3.2:5000/img/taza.jpg"))

            productos.add(Producto((Math.random() * 1000).toInt(),
                    "Playera Platzi",
                    "Se el chaval mas guay del barrio",
                    "ADSFasdfkjahsdgkjasfkbjasdgkbj",
                    200.00 + it,
                    "http://10.0.3.2:5000/img/tshirt.jpg"))
        }

        val playload = ResponseJson(payload = productos, statusCode = HttpStatusCode.OK.value)
        val gson = GsonBuilder().setPrettyPrinting().create()
        val jsonRs = gson.toJson(playload)

        handle {
            call.respondText(jsonRs, ContentType.Application.Json, HttpStatusCode.OK)
        }

    }
}