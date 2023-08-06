package com.example.examenblancspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExamenBlancSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenBlancSpringApplication.class, args);
    }
         @GetMapping("/home")
        public String home (){
            return "welcome home";
        }
}
