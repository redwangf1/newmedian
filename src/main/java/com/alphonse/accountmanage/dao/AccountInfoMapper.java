package com.alphonse.accountmanage.dao;

import com.alphonse.accountmanage.entity.AccountInfo;
import com.alphonse.accountmanage.entity.AccountInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountInfoMapper {
    long countByExample(AccountInfoExample example);

    int deleteByExample(AccountInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountInfo record);

    int insertSelective(AccountInfo record);

    List<AccountInfo> selectByExample(AccountInfoExample example);

    AccountInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountInfo record, @Param("example") AccountInfoExample example);

    int updateByExample(@Param("record") AccountInfo record, @Param("example") AccountInfoExample example);

    int updateByPrimaryKeySelective(AccountInfo record);

    int updateByPrimaryKey(AccountInfo record);

	List<AccountInfo> selectAll();

}