package com.cuit.springcloud.controller;

import com.cuit.springcloud.entities.Product;
import com.cuit.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@RefreshScope //刷新配置
@RestController
public class ProductController {

    @Value("${emp.name}")
    private  String name;

    @GetMapping("/hello")
    public String hello(){
            return name;
    }


    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

}