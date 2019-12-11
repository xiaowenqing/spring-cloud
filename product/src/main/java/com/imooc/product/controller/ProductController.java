package com.imooc.product.controller;    /**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author xwq
 * @date 2019/11/3 000312:18
 */

import com.imooc.product.VO.ProductInfoVO;
import com.imooc.product.VO.ProductVO;
import com.imooc.product.VO.ResultVO;
import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.service.CategoryService;
import com.imooc.product.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  1.查询所有在架的商品
 *
 * @author xwq
 * @create 2019-11-03 12:18
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;


    /**
     * 查询接口
     */
    @RequestMapping("/list")
    public ResultVO<ProductVO> list(){

        //查询所有在架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //从list 集合中获取到一个属性的集合可以通过这样做
        List<Integer> categoryTypeList = productInfoList.stream().map(ProductInfo::getCategoryType ).
                collect(Collectors.toList());


        //查询类目
        List<ProductCategory> categoriesList = categoryService.findByCategoryTypeIn(categoryTypeList);

        //构造数据
        List<ProductVO>  productVOList = new ArrayList<>();

        for(ProductCategory productCategory :categoriesList){
            ProductVO productVO = new ProductVO();

            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo prductInfo: productInfoList) {

                if (productCategory.getCategoryType().equals(prductInfo.getCategoryType())) {

                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(prductInfo, productInfoVO);

                    productInfoVOList.add(productInfoVO);

                }
            }
            productVO.setProductInfoVOList(productInfoVOList);

            productVOList.add(productVO);
        }

        ResultVO resultVO = new ResultVO();
        resultVO.setData(productVOList);
        resultVO.setCode(0);
        resultVO.setMsg("成功");


        return resultVO;
    }
}
