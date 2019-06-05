package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Post;
import com.vinhnq21.core.cms.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/getAllPosts")
    public List<Post> getAllPosts() {
        return postService.getAllPost();
    }

    @GetMapping("/getSinglePost/")
    public Post getSinglePost() {
        Post post = new Post();
        return post;
    }


    @PostMapping("/createPost")
    public Post createPost() {
        Post post = new Post();
        return post;
    }

    @PatchMapping("/updatePost")
    public Post updatePost() {
        Post post = new Post();
        return post;
    }

    @DeleteMapping("/deletePost")
    public Post deletePost() {
        Post post = new Post();
        return post;
    }
}
