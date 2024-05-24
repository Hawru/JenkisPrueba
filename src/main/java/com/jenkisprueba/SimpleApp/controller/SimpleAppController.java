package com.jenkisprueba.SimpleApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAppController {
    
    @GetMapping("/")
    public String getSimple(){
        return "Prueba Simple";
    }
}
