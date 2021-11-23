package com.example.FirstSpringBootApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutUs {

    @GetMapping ("/about")
    public String AboutUsPage (){
        return "About us...........";
    }

}
