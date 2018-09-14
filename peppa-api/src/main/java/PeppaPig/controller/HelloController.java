/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package PeppaPig.controller;


import com.peppa.dal.model.RolePermissionDO;
import com.peppa.dal.model.UserDO;
import com.peppa.dal.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peppa.user.repository.UserRepository;
import peppa.user.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * @Auther: qixin
 * @Date: 2018/09/05 11:40
 */
@RestController
@RequestMapping("peppa")
public class HelloController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/index")
    public String hello(){
        return "Hello 阿心！！！";
    }
    
    @RequestMapping("/{id}")
    public UserDO findById(@PathVariable("id")Integer id){
        String demo ;
        UserDO user = userService.selectByPrimaryKey(id);
        return user;
    }
//
//    @RequestMapping("/admin/{id}")
//    public List<RolePermissionDO> selectUserInfoByUserID(@PathVariable("id")Integer id){
//        List<RolePermissionDO> userInfo = userRepository.getUserInfoByID(id);
//        return userInfo;
//    }

}