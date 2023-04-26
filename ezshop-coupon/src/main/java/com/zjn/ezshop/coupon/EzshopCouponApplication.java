package com.zjn.ezshop.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zjn.ezshop.coupon.dao")
public class EzshopCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(EzshopCouponApplication.class, args);
    }

}
