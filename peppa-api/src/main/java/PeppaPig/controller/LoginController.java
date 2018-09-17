/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package PeppaPig.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import peppa.user.req.LoginReq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: qixin
 * @Date: 2018/09/17 10:34
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/sign",method = RequestMethod.POST)
    @ResponseBody
    public Map login(@RequestBody LoginReq req){
        Map result = new HashMap<>();
        try {
            UsernamePasswordToken token = new UsernamePasswordToken();
            token.setUsername(req.getUserPhone());
            token.setPassword(req.getPassword().toCharArray());
            SecurityUtils.getSubject().login(token);
            result.put("status",200);
            result.put("message","登陆成功");

        }catch (AuthenticationException e){
            e.printStackTrace();
            result.put("message",e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping("403")
    public String unauthorizedRole(){
        return "没有权限";
    }
}