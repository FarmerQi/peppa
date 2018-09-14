/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.peppa.dal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Auther: qixin
 * @Date: 2018/09/12 16:45
 */
@Data
public class UserInfo {
    private Integer userId;

    private String userName;

    private String userPhone;

    private String password;

    private String salt;

    private String state;

    private List<RoleInfo> roleInfoList;
}