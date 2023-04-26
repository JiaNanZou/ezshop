package com.zjn.ezshop.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zjn.ezshop.order.dao")
public class EzshopOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EzshopOrderApplication.class, args);
    }

}
