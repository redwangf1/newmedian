package com.alphonse.accountmanage.dao;

import com.alphonse.accountmanage.entity.AccountInstitution;
import com.alphonse.accountmanage.entity.AccountInstitutionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountInstitutionMapper {
    long countByExample(AccountInstitutionExample example);

    int deleteByExample(AccountInstitutionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountInstitution record);

    int insertSelective(AccountInstitution record);

    List<AccountInstitution> selectByExample(AccountInstitutionExample example);

    AccountInstitution selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountInstitution record, @Param("example") AccountInstitutionExample example);

    int updateByExample(@Param("record") AccountInstitution record, @Param("example") AccountInstitutionExample example);

    int updateByPrimaryKeySelective(AccountInstitution record);

    int updateByPrimaryKey(AccountInstitution record);

	List<AccountInstitution> selectAccountInstution();
}