package com.jason.zuul.controller;


import com.jason.zuul.entity.User;
import com.jason.zuul.service.UserFeignClient;
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
    UserFeignClient userFeignClient;

    @GetMapping("users/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }
}
