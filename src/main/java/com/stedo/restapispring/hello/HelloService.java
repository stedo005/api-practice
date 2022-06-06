package com.stedo.restapispring.hello;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    private final HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public Hello getSpecificHello(String name) {
        if (helloRepository.existsByName(name)) {
            return helloRepository.findByName(name);
        } else {
            throw new IllegalArgumentException("Name existiert nicht");
        }
    }

    public List<Hello> getAllHellos() {
        return helloRepository.findAll();
    }

    public String createHello(Hello hello) {
        if (helloRepository.existsByName(hello.getName())) {
            return "Name existiert schon.";
        }
        helloRepository.save(hello);
        return "Hello erstellt.";
    }

}
