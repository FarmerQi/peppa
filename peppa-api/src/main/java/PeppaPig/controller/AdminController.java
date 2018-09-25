/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package PeppaPig.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: qixin
 * @Date: 2018/09/20 14:19
 */

@RestController
@RequiresRoles({"admin"})
@RequestMapping(value = "/admin")
public class AdminController {


    @RequestMapping(value = "/add")
    public String add(){
        Subject subject = SecurityUtils.getSubject();
        if (subject.hasRole("admin")){
            return "Add user";
        }
        return "木有权限呀！";
    }

    @RequestMapping("/delete")
    public String delete(){
        return "Delete User";
    }

    @RequestMapping("update")
    public String update(){
        return "Update User";
    }

    @RequestMapping("query")
    public String query(){
        return "Query user";
    }

    @RequestMapping("logout")
    public String logout(){
        SecurityUtils.getSubject().logout();
        return "已退出";
    }
}