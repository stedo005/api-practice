package com.stedo.restapispring.hello;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hello")
public class Hello {

    @Id
    private String id;
    private final String name;
    private final String greeting;

    public Hello(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }

}
