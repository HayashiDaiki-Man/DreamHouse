package com.example.dreamhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/selection")
    public String getSelection(){
        return "selection";
    }

    @PostMapping("/selection")
    public String postSelection(){
        return "selection";
    }
}
