package com.example.fbtestappclientimplicit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//mvn spring-boot:run
@Controller
@SpringBootApplication
public class FbTestappClientimplicitApplication {

    public static void main(String[] args) {
        SpringApplication.run(FbTestappClientimplicitApplication.class, args);
    }

    @GetMapping("/")
    public String client() {
        return "client";
    }

    @GetMapping("/callback")
    public String callback(){
        return "Callback_page";
    }
}
