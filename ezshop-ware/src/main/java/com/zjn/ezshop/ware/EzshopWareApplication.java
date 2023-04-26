package com.zjn.ezshop.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zjn.ezshop.ware.dao")
public class EzshopWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(EzshopWareApplication.class, args);
    }

}
