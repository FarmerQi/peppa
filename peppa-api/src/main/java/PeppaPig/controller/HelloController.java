/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package PeppaPig.controller;


import dao.TestMapper;
import dao.UserDOMapper;
import model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peppa.user.service.UserInfoService;

/**
 * @Auther: qixin
 * @Date: 2018/09/05 11:40
 */
@RestController
@RequestMapping("peppa")
public class HelloController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/index")
    public String hello(){
        return "Hello 阿心！！！";
    }



    @RequestMapping("/{id}")
    public UserDO findById(@PathVariable("id")Integer id){
        return userInfoService.selectByPrimaryKey(id);
    }

    @RequestMapping("user")
    public UserDO getUser(){
        UserDO userDO = new UserDO();
        userDO.setId(1);
        userDO.setName("阿心");
        userDO.setPhone("18328090104");
        return userDO;
    }
}