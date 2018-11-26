package com.alphonse.accountmanage.dao;

import com.alphonse.accountmanage.entity.AccountPlatform;
import com.alphonse.accountmanage.entity.AccountPlatformExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountPlatformMapper {
    long countByExample(AccountPlatformExample example);

    int deleteByExample(AccountPlatformExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountPlatform record);

    int insertSelective(AccountPlatform record);

    List<AccountPlatform> selectByExample(AccountPlatformExample example);

    AccountPlatform selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountPlatform record, @Param("example") AccountPlatformExample example);

    int updateByExample(@Param("record") AccountPlatform record, @Param("example") AccountPlatformExample example);

    int updateByPrimaryKeySelective(AccountPlatform record);

    int updateByPrimaryKey(AccountPlatform record);

	List<AccountPlatform> selectPlaceType();
}