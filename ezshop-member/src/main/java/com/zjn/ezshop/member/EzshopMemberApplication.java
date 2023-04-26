package com.zjn.ezshop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zjn.ezshop.member.dao")
public class EzshopMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(EzshopMemberApplication.class, args);
    }

}
