package com.wipro.service;

import com.wipro.entity.Comment;
import com.wipro.entity.Post;
import com.wipro.repository.CommentRepository;
import com.wipro.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;

    public List<Comment> getAllCommentsForPost(Long postId) {
        return commentRepository.findByPostIdOrderByCreatedAtDesc(postId);
    }

    public Optional<Comment> getCommentById(Long id) {
        return commentRepository.findById(id);
    }

    public Comment createComment(Long postId, Comment comment) {
        return postRepository.findById(postId).map(post -> {
            comment.setPost(post);
            return commentRepository.save(comment);
        }).orElseThrow(() -> new RuntimeException("Post not found"));
    }

    public Optional<Comment> updateComment(Long id, Comment commentDetails) {
        return commentRepository.findById(id).map(comment -> {
            comment.setContent(commentDetails.getContent());
            return commentRepository.save(comment);
        });
    }

    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}
