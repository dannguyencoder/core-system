package com.vinhnq21.core.cms.service.impl;

import com.vinhnq21.core.cms.entities.Post;
import com.vinhnq21.core.cms.repository.PostRepository;
import com.vinhnq21.core.cms.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post getSinglePost(int postId) {
        Optional<Post> optionalPost = postRepository.findById(postId);
        if (!optionalPost.isPresent()) {
            throw new RuntimeException("Post not found");
        } else {
            return optionalPost.get();
        }
    }

    @Override
    public Post insertPost(Post postData) {

        postData.setId(0);

        postRepository.save(postData);

        return postData;
    }

    @Override
    public Post updatePost(Post newPostDataWithId) {

        Optional<Post> optionalPost = postRepository.findById(newPostDataWithId.getId());

        if (!optionalPost.isPresent()) {
            throw new RuntimeException("Post not found");
        } else {
            postRepository.save(newPostDataWithId);
        }

        return newPostDataWithId;
    }

    @Override
    public Post deletePost(int postId) {

        Optional<Post> optionalPost = postRepository.findById(postId);

        if (!optionalPost.isPresent()) {
            throw new RuntimeException("Post not found");
        } else {
            postRepository.deleteById(postId);
        }

        return optionalPost.get();
    }

}
