package com.jason.hystrix.controller;



import com.jason.hystrix.entity.User;
import com.jason.hystrix.service.UserService;
import com.jason.hystrix.service.impl.UserServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    UserService userService;

    @GetMapping("users/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }


}
