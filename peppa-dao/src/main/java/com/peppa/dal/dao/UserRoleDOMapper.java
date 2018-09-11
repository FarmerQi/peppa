package com.peppa.dal.dao;

import com.peppa.dal.model.UserRoleDO;
import com.peppa.dal.model.UserRoleDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleDOMapper {
    long countByExample(UserRoleDOExample example);

    int deleteByExample(UserRoleDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleDO record);

    int insertSelective(UserRoleDO record);

    List<UserRoleDO> selectByExample(UserRoleDOExample example);

    UserRoleDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRoleDO record, @Param("example") UserRoleDOExample example);

    int updateByExample(@Param("record") UserRoleDO record, @Param("example") UserRoleDOExample example);

    int updateByPrimaryKeySelective(UserRoleDO record);

    int updateByPrimaryKey(UserRoleDO record);
}