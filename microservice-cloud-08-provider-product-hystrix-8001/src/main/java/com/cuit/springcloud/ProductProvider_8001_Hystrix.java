package com.cuit.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@EnableHystrix              //开启熔断机制
@EnableEurekaClient         //将此服务注册到Eureka服务注册中心
@MapperScan("com.cuit.springcloud.mapper") //扫描所有Mapper接口
@SpringBootApplication
public class ProductProvider_8001_Hystrix {


    public static void main(String[] args) {
            SpringApplication.run(ProductProvider_8001_Hystrix.class, args);

    }
}