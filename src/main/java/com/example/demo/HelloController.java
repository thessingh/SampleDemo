package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Get call -> /hello -> Hello World with HTTP status code -> ok
    @GetMapping("/hello")
    public ResponseEntity helloWorld(){
        Person p = new Person("Santan", 28, "Hello World !!!");
        return ResponseEntity.ok(p);
    }
}
