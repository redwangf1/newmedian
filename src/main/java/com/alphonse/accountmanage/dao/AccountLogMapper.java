package com.alphonse.accountmanage.dao;

import com.alphonse.accountmanage.entity.AccountLog;
import com.alphonse.accountmanage.entity.AccountLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountLogMapper {
    long countByExample(AccountLogExample example);

    int deleteByExample(AccountLogExample example);

    int insert(AccountLog record);

    int insertSelective(AccountLog record);

    List<AccountLog> selectByExample(AccountLogExample example);

    int updateByExampleSelective(@Param("record") AccountLog record, @Param("example") AccountLogExample example);

    int updateByExample(@Param("record") AccountLog record, @Param("example") AccountLogExample example);
}