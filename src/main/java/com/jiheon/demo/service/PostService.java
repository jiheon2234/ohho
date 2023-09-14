package com.jiheon.demo.service;

import com.jiheon.demo.PostRepository.PostRepository;
import com.jiheon.demo.mapper.PostMapper;
import com.jiheon.demo.model.Post;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;


    @PostConstruct
    public void init(){
        List<Post> postList = List.of(
                new Post(UUID.randomUUID(), "title1","contents1","", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title2","contents2","", LocalDateTime.now())
        );
        postRepository.saveAll(postList);
    }

    public  List<Post> postList() {
//        return postRepository.findAll();
        return postMapper.listPost();
    }
}
