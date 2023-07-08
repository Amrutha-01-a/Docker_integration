package com.dockerint;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@RestController
public class dockerApp { 
    @GetMapping
    public String message() {
        return "hello from Amrutha";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(dockerApp.class, args);
    }
}
