package com.example.demos_.Controller;

import com.example.demos_.Entities.Comment;
import com.example.demos_.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/comments")
@CrossOrigin(origins = "*")
public class CommentController {

    @Autowired
    private CommentService commentService;
    @GetMapping
    public List<Comment> getAll() {
        return commentService.getAllComments();
    }
    @GetMapping("/character/{characterId}")
    public List<Comment> getByCharacterId(@PathVariable Long characterId) {
        return commentService.getCommentsByCharacter(characterId);
    }
    @PostMapping
    public Comment create(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }
}