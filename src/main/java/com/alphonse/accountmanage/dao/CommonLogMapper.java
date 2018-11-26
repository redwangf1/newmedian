package com.alphonse.accountmanage.dao;

import com.alphonse.accountmanage.entity.CommonLog;
import com.alphonse.accountmanage.entity.CommonLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CommonLogMapper {
    long countByExample(CommonLogExample example);

    int deleteByExample(CommonLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(CommonLog record);

    int insertSelective(CommonLog record);

    List<CommonLog> selectByExample(CommonLogExample example);

    CommonLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") CommonLog record, @Param("example") CommonLogExample example);

    int updateByExample(@Param("record") CommonLog record, @Param("example") CommonLogExample example);

    int updateByPrimaryKeySelective(CommonLog record);

    int updateByPrimaryKey(CommonLog record);
}