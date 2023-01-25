package com.example.demogc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class DemoController {

    @GetMapping
    public String demo() {
        return "Hello World!";
    }
}
