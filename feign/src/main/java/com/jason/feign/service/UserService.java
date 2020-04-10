package com.jason.feign.service;

import com.jason.feign.entity.User;
import feign.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Jason
 * @date 2020/4/1 19:02
 * @description
 */
@FeignClient(name = "service-provider",configuration = UserService.UserFeignConfig.class)
public interface UserService {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id")Long id);

    /**
     * 该Feign Client的配置类，注意：
     *  * 1. 该类可以独立出去；
     *  * 2. 该类上也可添加@Configuration声明是一个配置类；
     *  * 配置类上也可添加@Configuration注解，声明这是一个配置类；
     *  * 但此时千万别将该放置在主应用程序上下文@ComponentScan所扫描的包中，
     *  * 否则，该配置将会被所有Feign Client共享，无法实现细粒度配置！
     *  * 个人建议：像我一样，不加@Configuration注解
     */
    class UserFeignConfig{
        public Logger.Level logger(){
            return Logger.Level.FULL;
        }
    }
}
