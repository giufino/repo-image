package com.example.demogc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api")
public class DemoController {

    @GetMapping("hello")
    public String demo() {
        return "Hello World!";
    }
}
