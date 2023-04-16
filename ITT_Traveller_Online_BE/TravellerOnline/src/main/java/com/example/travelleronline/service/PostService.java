package com.example.travelleronline.service;

import com.example.travelleronline.model.DTOs.post.PostInfoDTO;
import com.example.travelleronline.model.entities.Post;
import com.example.travelleronline.model.repositories.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private ModelMapper mapper;

    //get post by post_id
    //get posts by user_id
    //get all posts
    //add post
    public PostInfoDTO addPost(PostInfoDTO newPost){//todo after service
        //validation with if statements for now
        Post p = mapper.map(newPost, Post.class);
        postRepository.save(p);
        return mapper.map(p, PostInfoDTO.class);
    }

    public PostInfoDTO getPostById(int id) {
        return null;
    }

    public List<PostInfoDTO> getUserPosts(int userId) {
        return null;
    }

    public List<PostInfoDTO> getPosts() {
        return null;
    }

    public PostInfoDTO updatePost(int postId, PostInfoDTO postInfoDTO) {
        return null;
    }

    public void deletePost(int id) {
    }
    //add video to post
    //delete post
    //update post
}
