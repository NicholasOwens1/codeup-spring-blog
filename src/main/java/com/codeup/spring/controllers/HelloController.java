package com.codeup.spring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {
    @GetMapping("/name")
    @ResponseBody
    public String hello() {
        return "Hello from Spring!";
    }
//    Path variable used to add input to a URI request
    @GetMapping("/hello/{name}")
    // Path variable annotations need to have data types announced.
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
//    Create a path variable that takes a number instead of a string.
    @RequestMapping(path= "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + ".";
    }
}
