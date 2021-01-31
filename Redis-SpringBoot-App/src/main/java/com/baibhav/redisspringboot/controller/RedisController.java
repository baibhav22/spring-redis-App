package com.baibhav.redisspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @GetMapping("/hello")
    public String checkEndPoint(){
        return "hello world";
    }

}
