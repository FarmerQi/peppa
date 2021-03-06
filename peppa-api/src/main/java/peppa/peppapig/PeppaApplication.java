/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package peppa.peppapig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: qixin
 * @Date: 2018/09/05 10:59
 */

@SpringBootApplication
@ComponentScan(basePackages = {"peppa", "com/peppa/peppapig"})
@MapperScan(value = {"com.peppa.dal.dao"})
@ServletComponentScan
public class PeppaApplication {
    public static void main(String[] args){
        SpringApplication.run(PeppaApplication.class,args);

    }

}