package cxx

import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.ApplicationCall
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.Routing
import io.ktor.server.routing.RoutingCall
import io.ktor.server.routing.get

suspend fun ApplicationCall.serverStyles(sheet: StyleSheet) {
    respondText(sheet.toString(), ContentType.Text.CSS)
}

fun Routing.stylesheet(sheet: StyleSheet) = stylesheet("/${sheet.path.lowercase()}.css", sheet)

fun Routing.stylesheet(path: String, sheet: StyleSheet) = get(path) {
    call.serverStyles(sheet)
}

inline fun <reified T : StyleSheet> Routing.stylesheet(
    crossinline sheet: RoutingCall.() -> T?
) = get("${T::class.qualifiedName?.lowercase()}.css") {
    val s = call.sheet()
    if (s != null) {
        call.serverStyles(s)
    } else {
        call.respond(HttpStatusCode.NotFound)
    }
}