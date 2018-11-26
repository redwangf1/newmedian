package com.alphonse.accountmanage.dao;

import com.alphonse.accountmanage.entity.AccountLevel;
import com.alphonse.accountmanage.entity.AccountLevelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountLevelMapper {
    long countByExample(AccountLevelExample example);

    int deleteByExample(AccountLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountLevel record);

    int insertSelective(AccountLevel record);

    List<AccountLevel> selectByExample(AccountLevelExample example);

    AccountLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountLevel record, @Param("example") AccountLevelExample example);

    int updateByExample(@Param("record") AccountLevel record, @Param("example") AccountLevelExample example);

    int updateByPrimaryKeySelective(AccountLevel record);

    int updateByPrimaryKey(AccountLevel record);

	List<AccountLevel> selectAccountLevel();

}