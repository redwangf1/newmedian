package com.alphonse.accountmanage.dao;

import com.alphonse.accountmanage.entity.AccountVerifiedLog;
import com.alphonse.accountmanage.entity.AccountVerifiedLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountVerifiedLogMapper {
    long countByExample(AccountVerifiedLogExample example);

    int deleteByExample(AccountVerifiedLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountVerifiedLog record);

    int insertSelective(AccountVerifiedLog record);

    List<AccountVerifiedLog> selectByExample(AccountVerifiedLogExample example);

    AccountVerifiedLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountVerifiedLog record, @Param("example") AccountVerifiedLogExample example);

    int updateByExample(@Param("record") AccountVerifiedLog record, @Param("example") AccountVerifiedLogExample example);

    int updateByPrimaryKeySelective(AccountVerifiedLog record);

    int updateByPrimaryKey(AccountVerifiedLog record);
}