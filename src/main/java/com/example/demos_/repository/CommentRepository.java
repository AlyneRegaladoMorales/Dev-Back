package com.example.demos_.repository;

import com.example.demos_.Entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByCharacterId(Long characterId);
}
