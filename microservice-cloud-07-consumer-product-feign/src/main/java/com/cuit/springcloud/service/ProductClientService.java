package com.cuit.springcloud.service;

import com.cuit.springcloud.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
//fallback的作用，处理熔断处理类，如果被调用的方法处现异常，就会交给熔断处理类中的方法进行处理
@FeignClient(value = "microservice-product",fallback =ProductClientServiceFallBack.class )//指定调用微服务的名称
public interface ProductClientService {


    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
     boolean add(@RequestBody Product product);

    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable("id") Long id) ;

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Product> list();


}
