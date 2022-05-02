package com.doubleclick.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
            println("URI: ${call.request.uri}")
            println("HEADERS: ${call.request.headers.names()}")

            println("User_Agent ${call.request.headers["User-Agent"]}")

            println("Accept ${call.request.headers["Accept"]}")

            println("QPars ${call.request.queryParameters.names()}")

            println("Name ${call.request.queryParameters["name"]}")
            println("email ${call.request.queryParameters["email"]}")


            call.respondText("Hello World!")
        }

        // sent parameter in link
        get("/notes/{page}"){
            var pageNum = call.parameters["page"]
//            call.respond("")

            //or

            call.respondText { "you are on page Number :$pageNum" }
        }
    }


}
