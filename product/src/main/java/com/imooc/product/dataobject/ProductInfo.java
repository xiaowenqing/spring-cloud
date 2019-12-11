package com.imooc.product.dataobject;    /**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author xwq
 * @date 2019/11/3 000312:36
 */

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表
 * @author xwq
 * @create 2019-11-03 12:36
 **/
@Table(name = "product_info")
@Data
@Entity
public class ProductInfo {

    @Id
    private String productId;//商品编码

    private String productName;//商品名称

    private BigDecimal productPrice;//商品单价

    private Integer productStock;//商品库存

    private String productDescription;//商品描述

    private String productIcon;//小图

    private Integer productStatus;//状态：0正常  1 下架

    private Integer categoryType;//类目编码

    private Date createTime;

    private Date updateTime;


}
