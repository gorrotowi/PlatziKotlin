package servidor

import com.google.gson.GsonBuilder
import org.jetbrains.ktor.application.Application
import org.jetbrains.ktor.application.install
import org.jetbrains.ktor.features.CallLogging
import org.jetbrains.ktor.features.DefaultHeaders
import org.jetbrains.ktor.http.ContentType
import org.jetbrains.ktor.http.HttpStatusCode
import org.jetbrains.ktor.request.receiveText
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.get
import org.jetbrains.ktor.routing.post
import org.jetbrains.ktor.routing.routing


fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)

    routing {

        get("/me") {
            val name = call.request.queryParameters["name"]
            val age = call.request.queryParameters["age"]

            val gson = GsonBuilder().setPrettyPrinting().create()

            if (name != null && age != null) {

                val edad = try {
                    age.toInt()
                } catch (e: NumberFormatException) {
                    0
                }
                val me = Persona(name, edad)
                val jsonRes = gson.toJson(me)
                call.respondText(jsonRes, ContentType.Application.Json, HttpStatusCode.OK)

            } else {
                val error = Error(HttpStatusCode.BadRequest.value, "Datos invalidos")
                call.respondText(gson.toJson(error), ContentType.Application.Json, HttpStatusCode.BadRequest)
            }
        }

        post("/postme") {
            val messagepost = call.receiveText()
            print(messagepost)
            call.respondText("Ok", ContentType.Text.Html, HttpStatusCode.OK)
        }

        getImages()

        listProducts()

    }

}
