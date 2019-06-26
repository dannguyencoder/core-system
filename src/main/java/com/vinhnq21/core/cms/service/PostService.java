package com.vinhnq21.core.cms.service;

import com.vinhnq21.core.cms.dto.PostDTO;
import com.vinhnq21.core.cms.entities.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

    List<PostDTO> getAllPost();

    Post getSinglePost(int postId);

    Post insertPost(Post postData);

    Post updatePost(Post newPostDataWithId);

    Post deletePost(int postId);

}
