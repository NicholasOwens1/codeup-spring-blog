package com.codeup.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{number}/{number2}")
    @ResponseBody
    public int add(@PathVariable int number, @PathVariable int number2) {
        return number + number2;
    }

    @GetMapping("/subtract/{number}/{number2}")
    @ResponseBody
    public int sub(@PathVariable int number, @PathVariable int number2) {
        return number + number2;
    }

    @GetMapping("/multiply/{number}/{number2}")
    @ResponseBody
    public int multiply(@PathVariable int number, @PathVariable int number2) {
        return number * number2;
    }

    @GetMapping("divide/{number}/{number2}")
    @ResponseBody
    public int divide(@PathVariable int number, @PathVariable int number2) {
        return number / number2;
    }
}
