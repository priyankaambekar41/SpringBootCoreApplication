package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayHello(){
        return "welcome to fintech csi pune";
    }

    @GetMapping("/welcome")
    public String sayWelcome(){
		    System.out.println("Line number 2");
		    System.out.println("Line 1");
        return "welcome to credit system india";
    }
}
