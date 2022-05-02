package com.doubleclick

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.doubleclick.plugins.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    /**
     * Creates an embedded server with the given [factory], listening on [host]:[port]
     * @param watchPaths specifies path substrings that will be watched for automatic reloading
     * @param configure configuration script for the engine
     * @param module application module function
     */
    embeddedServer(Netty, port = 8000, host = "127.0.0.1") {
        configureRouting()
        // this is way
        ContactUs()
        // another wey
//        install(Routing) {
//            homePage()
//        }
        // another wey
        routing {
            get("/eslam") {
                call.respondText("Hello eslam ")
            }
        }
    }.start(wait = true)
}

fun Route.homePage() {
    get("/") {
        call.respond("GoodMorning");
    }
}
