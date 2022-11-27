package com.portfolio.backend.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("rest/test")
public class HelloTest {

    @GetMapping
    public String hello(){
        return "Hello";
    }
}
