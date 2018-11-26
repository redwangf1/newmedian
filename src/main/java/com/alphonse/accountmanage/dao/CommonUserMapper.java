package com.alphonse.accountmanage.dao;

import com.alphonse.accountmanage.entity.CommonUser;
import com.alphonse.accountmanage.entity.CommonUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CommonUserMapper {
    long countByExample(CommonUserExample example);

    int deleteByExample(CommonUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommonUser record);

    int insertSelective(CommonUser record);

    List<CommonUser> selectByExample(CommonUserExample example);

    CommonUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommonUser record, @Param("example") CommonUserExample example);

    int updateByExample(@Param("record") CommonUser record, @Param("example") CommonUserExample example);

    int updateByPrimaryKeySelective(CommonUser record);

    int updateByPrimaryKey(CommonUser record);

	CommonUser selectByUsername(String username);
}