package com.alphonse.accountmanage.service;

import java.util.List;

import com.alphonse.accountmanage.entity.AccountInfo;
import com.alphonse.accountmanage.entity.AccountInstitution;
import com.alphonse.accountmanage.entity.AccountInstitutionType;
import com.alphonse.accountmanage.entity.AccountLevel;
import com.alphonse.accountmanage.entity.AccountPlatform;
import com.alphonse.accountmanage.entity.AccountPlatformThridparty;
import com.github.pagehelper.PageInfo;

public interface AccountInfoService {
	public PageInfo<AccountInfo> selectAll(int pageNum,int pageSize);
	public AccountInfo selectByPrimaryKey(int id);	
	public List<AccountInstitution> selectAccountInstution();
	public List<AccountInstitutionType> selectAccountInstutionType();
	public List<AccountLevel> selectAccountLevel();
	public List<AccountPlatform> selectPlaceType();
	public List<AccountPlatformThridparty> selectThirdparty();
	public List<AccountPlatform> selectAll();
	PageInfo<AccountInfo> selectByExample(Object zhuti, Object leixing, Object pingtai, Object qudao, Object disanfang, int pageNum,
			int pageSize);
}
