package com.gblogdemoapp.repository;

import com.gblogdemoapp.dto.CommentDto;
import com.gblogdemoapp.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

}