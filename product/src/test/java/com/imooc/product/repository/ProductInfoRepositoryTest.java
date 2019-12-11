//package com.imooc.product.repository;
//
//import com.imooc.product.dataobject.ProductInfo;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//
///**
// * @author xwq
// * @Title: ${file_name}
// * @Package ${package_name}
// * @Description: ${todo}
// * @date 2019/11/3 000313:33
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ProductInfoRepositoryTest {
//
//    @Autowired
//    private ProductInfoRepository productInfoRepository;
//
//    @Test
//    public void findByProductStatus() {
//        List<ProductInfo> list = productInfoRepository.findByProductStatus(0);
//
//        Assert.assertTrue(list.size()>0);
//        System.out.println(list.size());
//    }
//
//}