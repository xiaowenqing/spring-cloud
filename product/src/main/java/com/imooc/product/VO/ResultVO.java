package com.imooc.product.VO;    /**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author xwq
 * @date 2019/12/10 001021:31
 */

import lombok.Data;

/**
 *   http  返回的最外层对象
 * @author xwq
 * @create 2019-12-10 21:31
 **/
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体数据
     */
    private T data;
}
