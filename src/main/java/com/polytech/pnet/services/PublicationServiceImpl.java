package com.polytech.pnet.services;

import com.polytech.pnet.models.Post;
import com.polytech.pnet.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationServiceImpl implements PublicationService {

    private PostRepository postRepository;

    @Autowired
    public PublicationServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post post(Post post) {
        return postRepository.save(post);
    }

}
