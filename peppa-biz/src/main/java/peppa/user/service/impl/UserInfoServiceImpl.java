/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package peppa.user.service.impl;


import model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peppa.user.repository.UserRepository;
import peppa.user.service.UserInfoService;

/**
 * @Auther: qixin
 * @Date: 2018/09/05 18:01
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDO selectByPrimaryKey(Integer id) {
        return userRepository.selectByPrimaryKey(id);
    }
}