package com.stedo.restapispring.hello;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/say-hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/get-all")
    public List<Hello> getAllHellos() {
        return helloService.getAllHellos();
    }

    @GetMapping("/search")
    public String getGreeting(@RequestParam String name) {
        String username = helloService.getSpecificHello(name).getName();
        String greeting = helloService.getSpecificHello(name).getGreeting();
        String id = helloService.getSpecificHello(name).getId();

        return username + " das ist dein Gruß: " + greeting + "\ndeine Id lautet: " + id;
    }

    @PostMapping
    public String createHello(@RequestBody Hello hello) {
        return helloService.createHello(hello);
    }

}
