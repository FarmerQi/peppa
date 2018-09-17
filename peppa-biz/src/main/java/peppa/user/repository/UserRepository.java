/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package peppa.user.repository;

import com.peppa.dal.dao.*;
import com.peppa.dal.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * @Auther: qixin
 * @Date: 2018/09/05 17:41
 */

@Component
public class UserRepository {
    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private UserRoleDOMapper userRoleDOMapper;

    @Autowired
    private RoleDOMapper roleDOMapper;

    @Autowired
    private RolePermissionDOMapper rolePermissionDOMapper;

    @Autowired
    private PermissionDOMapper permissionDOMapper;
    /**
     * 根据用户ID查找用户
     * @param id
     * @return
     */
    public UserDO selectByPrimaryKey(Integer id){
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if (userDO==null){
            return null;
        }
        return userDO;
    }


    /**
     * 查找记录总数
     * @return
     */
    public Integer count(){
        UserDOExample example = new UserDOExample();
        int result = 0;
        result = (int)userDOMapper.countByExample(example);
        return result;
    }

    @Transactional
    public String addUser(UserDO userDO){
        int result = userDOMapper.insert(userDO);
        if (result==1){
            return "success";
        }else {
            return "添加失败";
        }
    }

//    public List<RolePermissionDO> getUserInfoByID(Integer id){
//        UserInfo userInfo = new UserInfo();
//        RoleInfo roleInfo = new RoleInfo();
//
//
//        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
//        userInfo.setUserDO(userDO);
//
//        //获取所有的角色
//        UserRoleDOExample userRoleDOExample = new UserRoleDOExample();
//        userRoleDOExample.createCriteria().andUserIdEqualTo(id);
//        List<UserRoleDO> userRoleDOList = userRoleDOMapper.selectByExample(userRoleDOExample);
//        List<RoleDO> roleDOS = roleDOMapper.selectRoles(userRoleDOList);
//        //将role 和 permission 映射为 map
//        List<RolePermissionDO> rolePermissionDOS = rolePermissionDOMapper.selectRolePermissions(roleDOS);
//
//        return rolePermissionDOS;
//    }


    public UserInfo selectUserInfoByUserPhone(String phoneNum){
        UserInfo userInfo = userDOMapper.selectUserInfoByUserPhone(phoneNum);
        return userInfo;
    }


}