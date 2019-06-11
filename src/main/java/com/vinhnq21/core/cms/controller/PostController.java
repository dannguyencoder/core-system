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

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPost();
    }

    @GetMapping("/posts/{postId}")
    public Post getSinglePost(@PathVariable int postId) {
        return postService.getSinglePost(postId);
    }


    @PostMapping("/posts")
    public Post createPost(@RequestBody Post postData) {
        return postService.insertPost(postData);
    }

    @PatchMapping("/posts")
    public Post updatePost(@RequestBody Post postData) {
        return postService.updatePost(postData);
    }

    @DeleteMapping("/posts/{postId}")
    public Post deletePost(@PathVariable int postId) {
        return postService.deletePost(postId);
    }
}
