package com.example.demos_.Service.impl;

import com.example.demos_.Entities.Comment;
import com.example.demos_.Service.CommentService;
import com.example.demos_.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public List<Comment> getCommentsByCharacter(Long characterId) {
        return commentRepository.findByCharacterId(characterId);
    }

    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

}
