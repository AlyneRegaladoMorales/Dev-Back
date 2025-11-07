package com.example.demos_.Service;

import com.example.demos_.Entities.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();
    List<Comment> getCommentsByCharacter(Long personId);
    Comment saveComment(Comment comment);
}
