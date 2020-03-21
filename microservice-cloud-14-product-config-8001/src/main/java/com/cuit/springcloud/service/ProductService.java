package com.cuit.springcloud.service;

import com.cuit.springcloud.entities.Product;

import java.util.List;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}