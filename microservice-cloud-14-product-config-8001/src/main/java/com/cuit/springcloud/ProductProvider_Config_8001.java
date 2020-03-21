package com.cuit.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@MapperScan("com.cuit.springcloud.mapper")
@EnableEurekaClient
@SpringBootApplication
public class ProductProvider_Config_8001 {
    public static void main(String[] args) {

        SpringApplication.run(ProductProvider_Config_8001.class,args);
    }
}
