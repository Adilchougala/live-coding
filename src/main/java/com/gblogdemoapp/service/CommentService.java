package com.gblogdemoapp.service;

import com.gblogdemoapp.dto.CommentDto;
import com.gblogdemoapp.entity.CommentEntity;
import com.gblogdemoapp.entity.Post;
import com.gblogdemoapp.repository.CommentRepository;
import com.gblogdemoapp.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CommentService {
    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    private PostRepository postRepository;

    public CommentDto createComment(long postId, CommentDto dto) {
        Post post = postRepository.findById(postId).get();
        dto.setPost(post);
        CommentEntity comment = new CommentEntity();
        comment.setEmailId(dto.getEmailId());
        comment.setContent(dto.getContent());
        comment.setPost(dto.getPost());
        CommentEntity savedComment = commentRepository.save(comment);

        dto.setId(savedComment.getId());
        dto.setEmailId(savedComment.getEmailId());
        dto.setContent(savedComment.getContent());
        dto.setDate(new Date());
        dto.setPost(savedComment.getPost());

        return dto;
    }

    /*public CommentEntity createComment(long postId, CommentEntity commentEntity) {
        Post post = postRepository.findById(postId).get();
        commentEntity.setPost(post);
       return commentRepository.save(commentEntity);
    }*/



}
