package com.codeup.spring.controllers;

import ch.qos.logback.core.model.Model;
import com.codeup.spring.models.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts/create")
//    @ResponseBody
    public String showPosts(Model model){
        return "posts/create";
    }
    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
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
