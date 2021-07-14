package com.mahdlyBE.mahdly.service;

import com.mahdlyBE.mahdly.data.model.Post;
import com.mahdlyBE.mahdly.data.model.University;
import com.mahdlyBE.mahdly.repository.PostRepository;
import com.mahdlyBE.mahdly.repository.UniversityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Iterable<Post> getPosts(){
        return postRepository.findAll();
    }

    public Post getPost(Long id){
        return postRepository.findPost(id);
    }
}
