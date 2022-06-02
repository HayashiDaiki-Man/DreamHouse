package com.example.dreamhouse.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RadioController {

    @RequestMapping("/selection")
    public String roof(Model model){
        Map<String, String> roofSelection = new HashMap<String, String>();
        Map<String, String> houseSelection = new HashMap<String, String>();
        Map<String, String> gardenSelection = new HashMap<String, String>();

        roofSelection.put("r1", "roof1");
        roofSelection.put("r2", "roof2");
        roofSelection.put("r3", "roof3");
        
        houseSelection.put("h1", "house1");
        houseSelection.put("h2", "house2");
        houseSelection.put("h3", "house3");

        gardenSelection.put("g1", "garden1");
        gardenSelection.put("g2", "garden2");
        gardenSelection.put("g3", "garden3");

        model.addAttribute("roofSelection", roofSelection);
        model.addAttribute("houseSelection", houseSelection);
        model.addAttribute("gardenSelection", gardenSelection);

        return "result";

    }

    @GetMapping("/result")
    public String result(){
        return "result";
    }

}
