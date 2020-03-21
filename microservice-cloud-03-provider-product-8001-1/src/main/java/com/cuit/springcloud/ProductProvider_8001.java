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
@EnableEurekaClient //将此服务注册到Eureka服务注册中心
@MapperScan("com.cuit.springcloud.mapper") //扫描所有Mapper接口
@SpringBootApplication
public class ProductProvider_8001 {


    public static void main(String[] args) {
            SpringApplication.run(ProductProvider_8001.class, args);

    }
}