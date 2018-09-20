/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package PeppaPig.config;

import com.peppa.dal.model.PermissionDO;
import com.peppa.dal.model.RoleInfo;
import com.peppa.dal.model.UserInfo;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import peppa.user.service.UserService;

/**
 * @Auther: qixin
 * @Date: 2018/09/12 15:33
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //将用户所拥有角色，权限进行赋值
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        UserInfo userInfo = (UserInfo)principalCollection.getPrimaryPrincipal();
        for (RoleInfo roleInfo: userInfo.getRoleInfoList()) {
            authorizationInfo.addRole(roleInfo.getRoleName());
            for (PermissionDO p:roleInfo.getPermissionDOList()) {
                authorizationInfo.addStringPermission(p.getName());
            }
        }
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //获取用户的账号
        String userPhone = (String)authenticationToken.getPrincipal();
        char[] password = (char[])authenticationToken.getCredentials();
        String psw = String.valueOf(password);
        UserInfo userInfo = userService.selectUserInfoByUserPhoneNum(userPhone,psw);
        if (userInfo == null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userInfo,userInfo.getPassword(),getName());
        return authenticationInfo;
    }


}