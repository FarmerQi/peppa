package com.peppa.common;/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: qixin
 * @Date: 2018/09/05 17:19
 */
@Data
public class Page<T> implements Serializable {
    private static final long serialVersionUID = 6381688311514987560L;

    /**
     * 请求开始的序列号，第一次为0
     */
    private Integer start = 0;

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 总数量
     */
    private Integer totalSize;

    /**
     * 数据
     */
    private List<T> dataList;

}