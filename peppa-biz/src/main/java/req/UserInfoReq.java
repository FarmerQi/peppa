/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package req;

import lombok.Data;

/**
 * @Auther: qixin
 * @Date: 2018/09/05 17:55
 */
@Data
public class UserInfoReq {
    Integer start;
    Integer pageSize;

}