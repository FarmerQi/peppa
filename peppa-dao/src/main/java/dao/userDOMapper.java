package dao;

import java.util.List;
import model.userDO;
import model.userDOExample;
import org.apache.ibatis.annotations.Param;

public interface userDOMapper {
    long countByExample(userDOExample example);

    int deleteByExample(userDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(userDO record);

    int insertSelective(userDO record);

    List<userDO> selectByExample(userDOExample example);

    userDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") userDO record, @Param("example") userDOExample example);

    int updateByExample(@Param("record") userDO record, @Param("example") userDOExample example);

    int updateByPrimaryKeySelective(userDO record);

    int updateByPrimaryKey(userDO record);
}