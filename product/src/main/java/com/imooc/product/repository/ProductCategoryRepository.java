package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xwq
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/12/2 000221:14
 */
public interface ProductCategoryRepository extends JpaRepository <ProductCategoryRepository,Integer> {


    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);


}
