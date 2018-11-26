package com.alphonse.accountmanage.dao;

import com.alphonse.accountmanage.entity.AccountInstitutionType;
import com.alphonse.accountmanage.entity.AccountInstitutionTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountInstitutionTypeMapper {
    long countByExample(AccountInstitutionTypeExample example);

    int deleteByExample(AccountInstitutionTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountInstitutionType record);

    int insertSelective(AccountInstitutionType record);

    List<AccountInstitutionType> selectByExample(AccountInstitutionTypeExample example);

    AccountInstitutionType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountInstitutionType record, @Param("example") AccountInstitutionTypeExample example);

    int updateByExample(@Param("record") AccountInstitutionType record, @Param("example") AccountInstitutionTypeExample example);

    int updateByPrimaryKeySelective(AccountInstitutionType record);

    int updateByPrimaryKey(AccountInstitutionType record);

	List<AccountInstitutionType> selectAccountInstutionType();
}