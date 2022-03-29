package com.example.demo.service.impl;

import com.example.demo.dao.PostDao;
import com.example.demo.entity.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Class for
 *
 * @author Funson
 * @date 2019/10/14
 */
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostDao postDao;

    @Override
    public List<Post> index() {
        return postDao.findAll();
    }

    @Override
    public Post findById(String id) {
        return postDao.findById(id).orElse(null);
    }

    @Override
    public Post save(Post model) {
        return postDao.save(model);
    }
}
