/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package PeppaPig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import peppa.user.repository.UserRepository;
import peppa.user.req.AddUserReq;

/**
 * @Auther: qixin
 * @Date: 2018/09/07 16:24
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "add" ,method = RequestMethod.POST)
    public void addUser(AddUserReq req){

    }
}