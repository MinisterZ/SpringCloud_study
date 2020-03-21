package com.cuit.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer_5001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001.class,args);
    }
}
