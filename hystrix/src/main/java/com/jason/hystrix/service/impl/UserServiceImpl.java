package com.jason.hystrix.service.impl;

import com.jason.hystrix.entity.User;
import com.jason.hystrix.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

/**
 * @author Jason
 * @date 2020/3/31 18:46
 * @description
 */
@Service
public class UserServiceImpl{
    @Autowired
    RestTemplate restTemplate;

    /**
     * hystrix默认超时时间为2000毫秒，当调用超时则直接调用指定的fallbackMethod
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id) {
        return restTemplate.getForObject("http://service-provider/users/{id}",User.class,id);
    }

    /**
     * fallbackMethod 的返回值、参数必须与调用方法一致
     * @param id
     * @return
     */
    public User fallback(Long id){
        return new User(9999L,"error","error",0, BigDecimal.ZERO);
    }
}
