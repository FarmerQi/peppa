/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package peppa.user.repository;

import com.peppa.dal.dao.UserDOMapper;
import com.peppa.dal.model.UserDO;
import com.peppa.dal.model.UserDOExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Auther: qixin
 * @Date: 2018/09/05 17:41
 */

@Component
public class UserRepository {
    @Autowired
    private UserDOMapper userDOMapper;

    public UserDO selectByPrimaryKey(Integer id){
        return userDOMapper.selectByPrimaryKey(id);
    }


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


}