package com.gui.udemyreferenceapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class FunController {
@GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
