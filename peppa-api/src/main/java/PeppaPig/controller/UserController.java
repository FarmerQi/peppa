/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package PeppaPig.controller;

import com.peppa.dal.model.UserDO;
import com.peppa.dal.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import peppa.user.repository.UserRepository;
import peppa.user.req.AddUserReq;
import peppa.user.service.UserService;

/**
 * @Auther: qixin
 * @Date: 2018/09/07 16:24
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String addUser(@RequestBody AddUserReq req){
        UserDO userDO = new UserDO();
        userDO.setName(req.getName());
        userDO.setPhone(req.getPhone());
        String result = userService.addUser(userDO);
        return result;
    }

    @RequestMapping("count")
    public Integer getCount(){
        Integer count = 0;
        count = userService.getCount();
        return count;
    }

    @RequestMapping("/admin/{phoneNum}")
    public UserInfo selectUserInfoByUserID(@PathVariable("phoneNum")String phoneNum){
        UserInfo userInfo = userService.selectUserInfoByUserPhoneNum(phoneNum);
        return userInfo;
    }

}