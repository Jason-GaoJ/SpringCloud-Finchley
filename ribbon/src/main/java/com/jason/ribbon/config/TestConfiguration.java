package com.jason.ribbon.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jason
 * @date 2020/4/1 18:48
 * @description
 */
@Configuration
@RibbonClient(name="service-provider",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
