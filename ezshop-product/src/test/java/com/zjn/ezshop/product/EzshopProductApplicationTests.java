package com.zjn.ezshop.product;

import com.zjn.ezshop.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class EzshopProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {

    }

    @Test
    void  test1(){

       brandService.removeBatchByIds(new ArrayList<>(Arrays.asList(1, 2, 3)));
    }

}
