package com.jason.ribbon.controller;


import com.jason.ribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jason
 * @date 2020/3/31 14:45
 * @description
 */
@RequestMapping("/")
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("users/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://service-provider/users/{id}",User.class,id);
    }
}
