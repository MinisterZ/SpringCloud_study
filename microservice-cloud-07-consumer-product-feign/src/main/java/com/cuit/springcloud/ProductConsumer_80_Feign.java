package com.cuit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
//会扫描包下使用@FeignClient标识的接口
@EnableFeignClients(basePackages = "com.cuit.springcloud.service")
@EnableEurekaClient //标识为Eureka的客户端
@SpringBootApplication
public class ProductConsumer_80_Feign {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumer_80_Feign.class, args);
    }
}
