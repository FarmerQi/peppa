/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.peppa.dal.model;

import lombok.Data;

import java.util.List;

/**
 * @Auther: qixin
 * @Date: 2018/09/12 17:02
 */
@Data
public class RoleInfo {
    private Integer roleId;

    private String roleName;

    private String description;

    private Integer roleAvailable;
    private List<PermissionDO> permissionDOList;
}