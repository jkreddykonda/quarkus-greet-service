package com.test.quarkus.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String greet(String name) {
        return "Hello " + name;
    }
}
