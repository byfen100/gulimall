package com.mandian.gulimall.product;

import com.mandian.gulimall.product.entity.BrandEntity;
import com.mandian.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("test");
        brandService.save(brandEntity);
        System.out.println("保存成功。。。");
    }

}
