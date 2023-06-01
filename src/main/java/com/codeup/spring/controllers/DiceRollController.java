package com.codeup.spring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DiceRollController {
    public static int getRandomInt(int min, int max) {
////        System.out.printf("Get a number between %d, and %d.%n", min, max);
        int randomNumber = (int) (Math.random() * max) + min;
        return randomNumber;
    }
    @GetMapping( "/roll-dice")
    public String rollDice(Model model) {
//        get random int between 0 AND 7
//        int randomInt = getRandomInt(1,6);
//        model.addAttribute("randomInt", randomInt);
//        model.addAttribute("n", n);
        return "roll-dice";
    }
    @GetMapping("roll-dice/{n}")
    public String rollDice(@PathVariable int n, Model model) {
//        get random int between 0 AND 7
        double randomInt = Math.floor(Math.random() * (6 - 1 + 1) + 1);
        model.addAttribute("randomInt", randomInt);
        model.addAttribute("n", n);
        String message = "";
        if (n == randomInt){
            message = "You guessed the number!";
        }
        else {
            message = "You guessed wrong!";
        }
        model.addAttribute("guess", n);
        model.addAttribute("roll", randomInt);
        model.addAttribute("message", message);
        return "roll-dice" ;
    }


//        get random int between 0 AND 7
//        getRandomInt(1,6);

//    create controller for /roll-dice where n is the number guessed
//    @PostMapping( "/roll-dice/{n}")
//    public String rollDice(@) {
//        get random int between 0 AND 7
//        getRandomInt(1,6);
//        return "roll-dice";
    }

