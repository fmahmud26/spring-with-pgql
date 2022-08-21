package com.example.springwithpgql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustCheck {

    @GetMapping
    private String justSayHello() {
        return "Hello";
    }
}
