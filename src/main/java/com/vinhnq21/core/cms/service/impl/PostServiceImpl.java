package com.vinhnq21.core.cms.service.impl;

import com.vinhnq21.core.cms.entities.Post;
import com.vinhnq21.core.cms.repository.PostRepository;
import com.vinhnq21.core.cms.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post getSinglePost(int postId) {
        return null;
    }

    @Override
    public Post insertPost(Post postData) {
        return null;
    }

    @Override
    public Post updatePost(int postId, Post newPostData) {
        return null;
    }

    @Override
    public Post deletePost(int postId) {
        return null;
    }

}
