package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * Class for
 *
 * @author Funson
 * @date 2019/10/14
 */
public interface UserService {
    List<User> index();
    User findByUsername(String username);
    User save(User model);
}
