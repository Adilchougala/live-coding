package com.gblogdemoapp.controller;

import com.gblogdemoapp.dto.CommentDto;
import com.gblogdemoapp.entity.CommentEntity;
import com.gblogdemoapp.repository.CommentRepository;
import com.gblogdemoapp.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.events.Comment;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentController {

    private CommentService commentService;
    private final CommentRepository commentRepository;

    public CommentController(CommentService commentService,
                             CommentRepository commentRepository) {
        this.commentService = commentService;
        this.commentRepository = commentRepository;
    }

    @PostMapping
    public ResponseEntity<CommentDto> createComment(
            @RequestParam long postId,
            @RequestBody CommentDto dto
    ){
        CommentDto comment = commentService.createComment(postId, dto);
        return new ResponseEntity<>(comment,HttpStatus.CREATED);
    }

   /* @PostMapping
    public ResponseEntity<CommentEntity> createComment(
            @RequestParam long postId,
            @RequestBody CommentEntity commentEntity
    ){
        CommentEntity comment = commentService.createComment(postId, commentEntity);
        return new ResponseEntity<>(comment,HttpStatus.CREATED);
    }*/
}