package com.codeup.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String showPosts(){
        return "posts index page";
    }

    @ResponseBody
    public String showOnePost(){
            return "view an individual post";
        }

    @ResponseBody
    public String showCreateForm(){
            return "view the form for creating a post";
        }
    @ResponseBody
    public String createPost(){
            return "create a new post";
    }

}
