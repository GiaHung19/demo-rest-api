package com.giahung.demorestapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {  
    @Value("${app.info.name}")
    private String appName;
    @Value("${app.info.author}")
    private String authorName;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from Spring Boot!";
    }

    @GetMapping("/hello/vn")
    public String sayHi(){
        return "Xin chào từ Spring Boot!";
    }  
    
    @GetMapping("/info") 
    public String getInfo(){
        return "Truong Gia Hung - Intern Java Backend";
    }
   
}
