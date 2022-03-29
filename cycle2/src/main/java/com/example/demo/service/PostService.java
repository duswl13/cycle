package com.example.demo.service;

import com.example.demo.entity.Post;

import java.util.List;
import java.util.Optional;

/**
 * Class for
 *
 * @author Funson
 * @date 2019/10/14
 */
public interface PostService {
    List<Post> index();
    Post save(Post model);
    Post findById(String id);
}
