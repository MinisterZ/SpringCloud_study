package com.cuit.springcloud.controller;

import com.cuit.springcloud.entities.Product;
import com.cuit.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    //fallbackMethod 指定当get方法出现异常时，将要调用的处理方法
    //处理方法的返回值和参数类型要一致
    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
      Product product=  productService.get(id);
      if(product==null){
          throw  new RuntimeException("ID=" + id + "无效");
      }
      return product;
    }

    @HystrixCommand(fallbackMethod = "getFallback1")
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

    public Product getFallback(@PathVariable("id") Long id){
        return new Product(id,
                "ID=" + id + "无效--@HystrixCommand",
                "无有效数据库");
    }
    public List<Product> getFallback1(){
        return null;

    }

}
