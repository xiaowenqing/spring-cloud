package com.imooc.product.common;    /**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author xwq
 * @date 2019/10/24 002414:51
 */

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 项目启动成功的运行的代码
 * @author xwq
 * @create 2019-10-24 14:51
 **/
@Component
public class ApplicationRunnerImpl implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("--------启动成功-------");
        String[] sourceArgs = args.getSourceArgs();
        for (String arg : sourceArgs) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}
