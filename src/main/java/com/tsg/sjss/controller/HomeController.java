package com.tsg.sjss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {

        return "views/home";
    }
    @GetMapping("/payment")
    public String payment(){
        return "views/payment";
    }
}
