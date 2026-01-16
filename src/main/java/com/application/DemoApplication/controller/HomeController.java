package com.application.DemoApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return ("Learn SpringBoot");
    }

    @RequestMapping("/about")
    public String about(){
        return "AboutPage";
    }
}
