package com.backend.security.resources;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloWorldResource {
    

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/csrf-token")
    public CsrfToken helloWorld(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    
}
