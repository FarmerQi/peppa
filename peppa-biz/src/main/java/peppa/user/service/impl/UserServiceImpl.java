/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package peppa.user.service.impl;


import com.peppa.dal.model.UserDO;
import com.peppa.dal.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peppa.user.repository.UserRepository;
import peppa.user.service.UserService;

/**
 * @Auther: qixin
 * @Date: 2018/09/05 18:01
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDO selectByPrimaryKey(Integer id) {
        return userRepository.selectByPrimaryKey(id);
    }

    @Override
    public String addUser(UserDO user) {
        return userRepository.addUser(user);
    }

    @Override
    public Integer getCount() {
        return userRepository.count();
    }

    @Override
    public UserInfo selectUserInfoByUserPhoneNum(String phoneNum,String password) {
        return userRepository.selectUserInfoByUserPhone(phoneNum,password);
    }

}