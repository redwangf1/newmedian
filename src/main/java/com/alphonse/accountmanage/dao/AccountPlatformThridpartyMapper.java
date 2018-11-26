package com.alphonse.accountmanage.dao;

import com.alphonse.accountmanage.entity.AccountPlatformThridparty;
import com.alphonse.accountmanage.entity.AccountPlatformThridpartyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountPlatformThridpartyMapper {
    long countByExample(AccountPlatformThridpartyExample example);

    int deleteByExample(AccountPlatformThridpartyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountPlatformThridparty record);

    int insertSelective(AccountPlatformThridparty record);

    List<AccountPlatformThridparty> selectByExample(AccountPlatformThridpartyExample example);

    AccountPlatformThridparty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountPlatformThridparty record, @Param("example") AccountPlatformThridpartyExample example);

    int updateByExample(@Param("record") AccountPlatformThridparty record, @Param("example") AccountPlatformThridpartyExample example);

    int updateByPrimaryKeySelective(AccountPlatformThridparty record);

    int updateByPrimaryKey(AccountPlatformThridparty record);

	List<AccountPlatformThridparty> selectThirdparty();
}