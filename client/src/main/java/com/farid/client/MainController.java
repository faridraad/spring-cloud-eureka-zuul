package com.farid.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
public class MainController {
    @GetMapping(value = "/")
    public String eurekaClient1(){
        return "Hello.This is a eureka client!";
    }
}
