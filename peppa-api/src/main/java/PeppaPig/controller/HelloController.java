/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package PeppaPig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: qixin
 * @Date: 2018/09/05 11:40
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return "Hello 阿心！！！";
    }

}