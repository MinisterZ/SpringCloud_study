package com.cuit.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@Configuration
public class ConfigBean {

    // @LoadBalanced   实现负载均衡，调用地址IP可以变成服务名称，
    // 服务名称就是被调用的哪个提供商yml配置中的名称spring.application.name
    @LoadBalanced
    // 向容器中添加 RestTemplate 组件,直接通过此组件可调用 REST 接口
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
