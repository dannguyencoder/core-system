package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Post;
import com.vinhnq21.core.cms.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPost();
    }

    @GetMapping("/{postId}")
    public Post getSinglePost(@PathVariable int postId) {
        return postService.getSinglePost(postId);
    }


    @PostMapping
    public Post createPost(@RequestBody Post postData) {
        return postService.insertPost(postData);
    }

    @PatchMapping
    public Post updatePost(@RequestBody Post postData) {
        return postService.updatePost(postData);
    }

    @DeleteMapping("/{postId}")
    public Post deletePost(@PathVariable int postId) {
        return postService.deletePost(postId);
    }
}
