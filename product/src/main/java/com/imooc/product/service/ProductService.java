package com.imooc.product.service;    /**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author xwq
 * @date 2019/12/10 001021:04
 */

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 *
 * @author xwq
 * @create 2019-12-10 21:04
 **/
public interface ProductService{
    /**
     * 查询所有在架商品
     *
     *
     */
    List<ProductInfo> findUpAll();
}
