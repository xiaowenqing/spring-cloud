package com.imooc.product.VO;    /**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author xwq
 * @date 2019/12/10 001021:35
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 *
 * @author xwq
 * @create 2019-12-10 21:35
 **/
@Data
public class ProductVO {

    @JsonProperty("name")//该注解作用是返回给前端的属性是name
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;
}
