package com.codeup.spring.controllers;


import com.codeup.spring.models.CommentRepository;
import com.codeup.spring.models.Post;
import com.codeup.spring.models.PostRepository;
import com.codeup.spring.models.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostController {
    private PostRepository postsDao;
    private UserRepository usersDao;
    private CommentRepository commentsDao;

    public PostController(PostRepository postsDao, UserRepository usersDao, CommentRepository commentsDao) {
        this.postsDao = postsDao;
        this.usersDao = usersDao;
        this.commentsDao = commentsDao;
    }
    @GetMapping("/posts")
    public String allPosts(Model model){
        List<Post> posts = postsDao.findAll();
        posts.add(new Post("test", "test"));
        posts.add(new Post("test2", "test2"));
        model.addAttribute("posts", posts);
        return "posts/index";
    }
    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable long id, Model model){
//        Post post = postsDao.findById(id);
        Post post = new Post("test", "test");
        model.addAttribute("post", post);
        return "posts/show";
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
}
