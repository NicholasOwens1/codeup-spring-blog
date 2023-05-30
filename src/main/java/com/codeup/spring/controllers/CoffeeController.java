package com.codeup.spring.controllers;

import com.codeup.spring.models.Coffee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.AttributedString;

@Controller
public class CoffeeController {
    @GetMapping("/coffee")
    public String coffeePage(){
        return "coffee";
    }

    @PostMapping("/coffee")
    public String newsletterSignup(@RequestParam(name = "email") String email, Model model){
        model.addAttribute("email", email);
        return "coffee";
    }

    public static int getRandomInt(int min, int max) {
//        System.out.printf("Get a number between %d, and %d.%n", min, max);
        int randomNumber = (int) (Math.random() * max) + min;
        return randomNumber;
    }
    @GetMapping("/coffee/{roast}")
    public String favRoast(@PathVariable String roast, Model model){
//        get a random int from 0 and 7;

        Coffee coffee = new Coffee(roast);
        coffee.setOrigin(roast.equals("dark") ? "Sumatra" : "Colombia");
        if (roast.equals("dark")) {
            coffee.setOrigin("Sumatra");
        } else {
            coffee.setOrigin("Colombia");
        }
        model.addAttribute("roast", roast);
        return "coffee";
    }
}
