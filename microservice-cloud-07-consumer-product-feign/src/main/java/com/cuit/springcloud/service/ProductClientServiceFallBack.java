package com.cuit.springcloud.service;

import com.cuit.springcloud.entities.Product;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@Component
public class ProductClientServiceFallBack implements ProductClientService{
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id,"id="+id+"无数据--@feignclient&hystrix","无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
