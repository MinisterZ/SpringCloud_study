package com.cuit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 *
 *
 */
//http://localhost:被监控的端口/actuator/hystrix.stream

@EnableHystrixDashboard//开启服务监控
@SpringBootApplication
public class HystrixDashboard_9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard_9001.class,args);
    }
}
