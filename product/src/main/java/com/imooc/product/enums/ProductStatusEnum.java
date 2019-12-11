package com.imooc.product.enums;    /**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author xwq
 * @date 2019/12/10 001021:12
 */

import lombok.Getter;

/**
 * 商品上下架状态
 * @author xwq
 * @create 2019-12-10 21:12
 **/
@Getter//省略get  set方法
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架"),
    ;

    private Integer code;

    private String message;


    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }



}
