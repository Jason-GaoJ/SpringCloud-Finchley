package com.jason.hystrix.service;

import com.jason.hystrix.entity.User;
import com.jason.hystrix.service.impl.UserServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Jason
 * @date 2020/3/31 18:46
 * @description
 */
@FeignClient(name = "service-provider",fallbackFactory = UserServiceImpl.class)
public interface UserService {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);
}
