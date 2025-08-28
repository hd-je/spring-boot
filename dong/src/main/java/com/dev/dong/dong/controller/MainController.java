package com.dev.dong.dong.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {
    
        
    @GetMapping("/main/hello")
    public String main() {
        return "hello";
    }
}