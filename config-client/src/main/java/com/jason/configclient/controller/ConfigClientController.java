package com.jason.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason
 * @date 2020/4/7 15:51
 * @description
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String hello(){
        return profile;
    }
}
