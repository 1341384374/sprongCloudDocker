package com.example.provideruser.controller;

import com.example.provideruser.dao.UserDao;
import com.example.provideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author ：JiuXu
 * @date ：Created in 2021/11/8 15:33
 */
@RestController
public class UserContorller {
    @Autowired
    private UserDao userDao;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id){
        Optional<User> findOne = this.userDao.findById(id);
        return findOne;
    }
}
