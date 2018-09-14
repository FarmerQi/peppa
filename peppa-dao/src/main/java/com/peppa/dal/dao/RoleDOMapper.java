package com.peppa.dal.dao;

import com.peppa.dal.model.RoleDO;
import com.peppa.dal.model.RoleDOExample;
import java.util.List;

import com.peppa.dal.model.UserRoleDO;
import org.apache.ibatis.annotations.Param;

public interface RoleDOMapper {
    long countByExample(RoleDOExample example);

    int deleteByExample(RoleDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleDO record);

    int insertSelective(RoleDO record);

    List<RoleDO> selectByExample(RoleDOExample example);

    RoleDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleDO record, @Param("example") RoleDOExample example);

    int updateByExample(@Param("record") RoleDO record, @Param("example") RoleDOExample example);

    int updateByPrimaryKeySelective(RoleDO record);

    int updateByPrimaryKey(RoleDO record);

    List<RoleDO> selectRoles(List<UserRoleDO> userRoleDOList);
}