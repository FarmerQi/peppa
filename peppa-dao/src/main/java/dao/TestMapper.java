/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package dao;

import model.UserDO;

/**
 * @Auther: qixin
 * @Date: 2018/09/06 18:09
 */
public interface TestMapper {

    UserDO selectById(Integer id);
}