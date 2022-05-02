package com.doubleclick.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.ContactUs() {

    routing {
        //Builds a route to match GET requests with the specified path.
        get("/contactus") {
            call.respond("Contact Us")
        }

        get("/aboutus") {
            call.respond("about us")
        }
    }

}

class ContactUs {


}