package com.jason.hystrix.service.impl;

import com.jason.hystrix.entity.User;
import com.jason.hystrix.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

/**
 * @author Jason
 * @date 2020/3/31 18:46
 * @description
 */
@Component
@Slf4j
public class UserServiceImpl implements FallbackFactory<UserService> {

    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User findById(Long id) {
                log.error("进入回退方法");
                return new User(9999L,"error","error",0, BigDecimal.ZERO);
            }
        };
    }
}
