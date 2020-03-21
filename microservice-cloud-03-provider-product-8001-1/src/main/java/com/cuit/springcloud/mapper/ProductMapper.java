package com.cuit.springcloud.mapper;

import com.cuit.springcloud.entities.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
//@Mapper //或在主启动类上使用@MapperScan注解
public interface ProductMapper {
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}
