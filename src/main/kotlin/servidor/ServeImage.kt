package servidor

import org.jetbrains.ktor.content.resolveResource
import org.jetbrains.ktor.http.ContentType
import org.jetbrains.ktor.http.HttpMethod
import org.jetbrains.ktor.http.HttpStatusCode
import org.jetbrains.ktor.response.respond
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.Route
import org.jetbrains.ktor.routing.route

fun Route.getImages() {
    route(HttpMethod.Get, "/") {
        route(HttpMethod.Get, "img") {
            route("/") {
                handle {
                    call.respondText("404", ContentType.Text.Html, HttpStatusCode.NotFound)
                }
            }
            route("{image}") {
                handle {
                    val img = call.parameters["image"]
                    img?.let {
                        val imgResp = call.resolveResource("/images/$img")
                        if (imgResp != null) {
                            call.respond(imgResp)
                        } else {
                            call.respondText("404", ContentType.Text.Html, HttpStatusCode.NotFound)
                        }
                    }
                }
            }
        }
    }
}