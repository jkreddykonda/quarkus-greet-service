package com.test.quarkus.controller;

import com.test.quarkus.service.GreetingService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/greet")
@Produces(MediaType.TEXT_PLAIN)
public class GreetingController {

    @Inject
    GreetingService greetingService;

    @GET
    @Path("/{name}")
    public String greet(@PathParam("name") String name, @QueryParam("suffix") String suffix) {
        String base = greetingService.greet(name);
        return suffix != null ? base + " " + suffix + "!" : base + "!";
    }
}
