package com.jiheon.demo.conrtroller;

import com.jiheon.demo.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/list")
    public List<Post> postList(){
        return List.of(
                new Post("1", "title1","contents1","", LocalDateTime.now()),
               new Post("2", "title2","contents2","", LocalDateTime.now())
               );
    }

    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId){
        return Post.builder()
                .postId(postId)
                .title("title1")
                .contents("contents1")
                .author("")
                .createdDateTime(LocalDateTime.now())
                .build();

    }


}
