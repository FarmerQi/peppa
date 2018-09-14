package com.peppa.dal.dao;

import com.peppa.dal.model.PermissionDO;
import com.peppa.dal.model.RoleDO;
import com.peppa.dal.model.RolePermissionDO;
import com.peppa.dal.model.RolePermissionDOExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RolePermissionDOMapper {
    long countByExample(RolePermissionDOExample example);

    int deleteByExample(RolePermissionDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolePermissionDO record);

    int insertSelective(RolePermissionDO record);

    List<RolePermissionDO> selectByExample(RolePermissionDOExample example);

    RolePermissionDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolePermissionDO record, @Param("example") RolePermissionDOExample example);

    int updateByExample(@Param("record") RolePermissionDO record, @Param("example") RolePermissionDOExample example);

    int updateByPrimaryKeySelective(RolePermissionDO record);

    int updateByPrimaryKey(RolePermissionDO record);

    List<RolePermissionDO> selectRolePermissions(List<RoleDO> roles);
}