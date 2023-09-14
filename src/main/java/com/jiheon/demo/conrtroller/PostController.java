package com.jiheon.demo.conrtroller;

import com.jiheon.demo.model.Post;
import com.jiheon.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    @GetMapping("/list")
    public List<Post> postList(){
        return postService.postList();
    }

    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId){
        return Post.builder()
                .postId(UUID.randomUUID())
                .title("title1")
                .contents("contents1")
                .author("")
                .createdDateTime(LocalDateTime.now())
                .build();

    }


}
