package com.test.quarkus.controller;

import java.util.List;

import com.test.quarkus.entity.Person;
import com.test.quarkus.repository.PersonRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class PersonController {

	@Inject
    PersonRepository repository;

    @POST
    @Transactional
    public void addPerson(Person person) {
        repository.persist(person);
    }

    @GET
    public List<Person> getAllPersons() {
        return repository.listAll();
    }

    @GET
    @Path("/search/{name}")
    public Person getPersonByName(@PathParam("name") String name) {
        return repository.find("name", name).firstResult();
    }
    
    @POST
    @Path("/raw")
    @Consumes(MediaType.APPLICATION_JSON)
    public String testRaw(String rawJson) {
        return "Received: " + rawJson;
    }
}
