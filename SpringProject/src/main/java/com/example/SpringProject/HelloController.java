package com.example.SpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name) {
        return String.format("Hello %s",name);
    }

//    @GetMapping("/reverse")
    public String getReverse(String word){
        return new StringBuilder(word).reverse().toString();
    }

}
