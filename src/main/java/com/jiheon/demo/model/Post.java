package com.jiheon.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Post {
    private String postId;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createdDateTime;

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String postId;
        private String title;
        private String contents;
        private String author;
        private LocalDateTime createdDateTime;



        public Builder postId(String postId){
            this.postId = postId;
            return this;
        }

        public Builder title(String title){
            this.title = title;
            return this;
        }
        public Builder contents(String contents){
            this.contents = contents;
            return this;
        }
        public Builder author(String author){
            this.author = author;
            return this;
        }
        public Builder createdDateTime(LocalDateTime createdDateTime){
            this.createdDateTime = createdDateTime;
            return this;
        }

        public Post build(){
            System.out.println(createdDateTime);
            return new Post(postId, title,contents,author,createdDateTime);

        }

    }


}
