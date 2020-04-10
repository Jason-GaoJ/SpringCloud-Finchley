package com.jason.feign.controller;


import com.jason.feign.entity.User;
import com.jason.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason
 * @date 2020/3/31 14:45
 * @description
 */
@RequestMapping("/")
@RestController
public class UserController {

    @Autowired
    UserService UserService;

    @GetMapping("users/{id}")
    public User findById(@PathVariable Long id) {
        return this.UserService.findById(id);
    }
}
