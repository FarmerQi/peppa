/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package PeppaPig.controller;

import netscape.javascript.JSObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import peppa.user.req.LoginReq;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
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
    public Map login(
            @RequestParam(value = "userPhone")String userPhone,
            @RequestParam(value = "password")String password,
            HttpServletRequest request, HttpServletResponse response){

        Map result = new HashMap<>();
        try {
            UsernamePasswordToken token = new UsernamePasswordToken();
            token.setUsername(userPhone);
            token.setPassword(password.toCharArray());

            Subject subject = SecurityUtils.getSubject();
            subject.login(token);

            Boolean state = subject.hasRole("admin");
            String sessionId = (String) request.getSession().getId();
            System.out.println("--------------sessionId: " + sessionId);
            Cookie cookie = new Cookie("Hello",sessionId);

            response.addCookie(cookie);
            System.out.println(cookie.getValue());
            //subject.checkPermission("addUser");
            System.out.println("----拥有Admin角色----" + state);

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