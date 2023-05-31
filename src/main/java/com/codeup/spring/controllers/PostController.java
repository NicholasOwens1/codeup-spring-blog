package com.codeup.spring.controllers;

import ch.qos.logback.core.model.Model;
import com.codeup.spring.models.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String index(){
        return "posts index page";
    }
    @GetMapping("/posts/{id}")
    @ResponseBody
    public String show(){
        return "view an individual post";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String showPosts(Model model){
        return "posts/create";
    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "create a new post";
    }

    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

}
