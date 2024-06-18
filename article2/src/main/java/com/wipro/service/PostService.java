package com.wipro.service;

import com.wipro.entity.Post;
import com.wipro.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> updatePost(Long id, Post postDetails) {
        return postRepository.findById(id).map(post -> {
            post.setTitle(postDetails.getTitle());
            post.setContent(postDetails.getContent());
            return postRepository.save(post);
        });
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
