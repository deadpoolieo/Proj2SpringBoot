package com.example.springbootproj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Springbootproj1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootproj1Application.class, args);
    }

}
