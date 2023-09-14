package com.jiheon.demo.mapper;

import com.jiheon.demo.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    public List<Post> listPost();
}
