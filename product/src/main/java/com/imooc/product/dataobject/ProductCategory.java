package com.imooc.product.dataobject;    /**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author xwq
 * @date 2019/12/2 000221:04
 */

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author xwq
 * @create 2019-12-02 21:04
 **/
@Table(name = "product_category")
@Data
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue//自增
    private Integer categoryId;

    //类目名称
    private String categoryName;

    //类目编号
    private Integer categoryType;

    private Data createTime;

    private Data updateTime;
}
