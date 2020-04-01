package com.jason.hystrix.service;

import com.jason.hystrix.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author Jason
 * @date 2020/3/31 18:46
 * @description
 */
public interface UserService {

    User findById(Long id);
}
