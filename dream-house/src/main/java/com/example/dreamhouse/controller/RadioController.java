package com.example.dreamhouse.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RadioController {

    @RequestMapping("/selection")
    public String roof(Model model){
        Map<String, String> roofSelection = new HashMap<String, String>();
        Map<String, String> houseSelection = new HashMap<String, String>();
        Map<String, String> gardenSelection = new HashMap<String, String>();

        roofSelection.put("1", "roof1");
        roofSelection.put("2", "roof2");
        roofSelection.put("3", "roof3");
        
        houseSelection.put("1", "house1");
        houseSelection.put("2", "house2");
        houseSelection.put("3", "house3");

        gardenSelection.put("1", "garden1");
        gardenSelection.put("2", "garden2");
        gardenSelection.put("3", "garden3");

        model.addAttribute("roofSelection", roofSelection);
        model.addAttribute("houseSelection", houseSelection);
        model.addAttribute("gardenSelection", gardenSelection);

        return "selection";

    }

}
