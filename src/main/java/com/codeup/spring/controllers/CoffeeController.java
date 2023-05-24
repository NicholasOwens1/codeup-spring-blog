package com.codeup.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CoffeeController {
    @GetMapping("/coffee")
    public String coffeePage(){
        return "coffee";
    }
    @GetMapping("/coffee/{roast}")
    public String favRoast(@PathVariable String roast){
        return "coffee";
    }
}
