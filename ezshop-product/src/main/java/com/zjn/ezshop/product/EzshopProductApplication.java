package com.zjn.ezshop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zjn.ezshop.product.dao")
public class EzshopProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EzshopProductApplication.class, args);
    }

}
