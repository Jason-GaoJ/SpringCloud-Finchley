package com.jason.feign.service.impl;

import com.jason.feign.entity.User;
import com.jason.feign.service.UserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Jason
 * @date 2020/4/8 15:31
 * @description
 */
@Component
public class UserServiceImpl implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User findById(Long id) {
                return new User();
            }
        };
    }
}
