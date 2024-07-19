package com.gblogdemoapp.service;

import com.gblogdemoapp.dto.PostDto;
import com.gblogdemoapp.entity.Post;
import com.gblogdemoapp.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setName(postDto.getName());
        post.setContent(postDto.getContent());
        Post savedPost = postRepository.save(post);

        postDto.setId(savedPost.getId());
        postDto.setName(savedPost.getName());
        postDto.setContent(savedPost.getContent());
        postDto.setDate(new Date());
        return postDto;
    }




}
