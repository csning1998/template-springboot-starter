package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LoginController {

    @RequestMapping("/testLogin")
    public String index() {
        return "Hello World";
    }
}
