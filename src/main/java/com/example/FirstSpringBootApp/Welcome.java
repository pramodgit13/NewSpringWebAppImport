package com.example.FirstSpringBootApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping
    public String HomePage (){
        return "Hard work!";
    }
}
