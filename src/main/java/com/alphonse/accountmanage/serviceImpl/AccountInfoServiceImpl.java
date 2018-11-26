package com.alphonse.accountmanage.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.accessibility.Accessible;

import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alphonse.accountmanage.dao.AccountInfoMapper;
import com.alphonse.accountmanage.dao.AccountInstitutionMapper;
import com.alphonse.accountmanage.dao.AccountInstitutionTypeMapper;
import com.alphonse.accountmanage.dao.AccountLevelMapper;
import com.alphonse.accountmanage.dao.AccountPlatformMapper;
import com.alphonse.accountmanage.dao.AccountPlatformThridpartyMapper;
import com.alphonse.accountmanage.entity.AccountInfo;
import com.alphonse.accountmanage.entity.AccountInfoExample;
import com.alphonse.accountmanage.entity.AccountInstitution;
import com.alphonse.accountmanage.entity.AccountInstitutionType;
import com.alphonse.accountmanage.entity.AccountLevel;
import com.alphonse.accountmanage.entity.AccountPlatform;
import com.alphonse.accountmanage.entity.AccountPlatformThridparty;
import com.alphonse.accountmanage.service.AccountInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service(value ="accountInfoService")
public class AccountInfoServiceImpl implements AccountInfoService{

	public AccountInfoServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private AccountInfoMapper accountInfoMapper;
	@Autowired
	private AccountInstitutionMapper accountInstitutionMapper;
	@Autowired
	private AccountLevelMapper accountLevelMapper;
	@Autowired
	private AccountPlatformMapper accountPlatformMapper;
	@Autowired
	private AccountPlatformThridpartyMapper accountPlatformThridpartyMapper;
	@Autowired
	private AccountInstitutionTypeMapper accountInstitutionTypeMapper;
	@Autowired
	private static AccountInfoExample accountInfoExample ;
//	public AccountInfo findAll(int pageNum,int pageSize){
//		 PageHelper.startPage(pageNum, pageSize);
//	        return accountInfoMapper.selectByPrimaryKey(1);
//	}
	
	public AccountInfo selectByPrimaryKey(int id){
	//	 PageHelper.startPage(pageNum, pageSize);
			AccountInfoExample accountInfoExample = new AccountInfoExample();
			//accountInfoExample.createCriteria().andInstitutionEqualTo(String.valueOf(id));
	        return accountInfoMapper.selectByExample(accountInfoExample).get(0);
	}

	@Override
	public PageInfo<AccountInfo> selectAll(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<AccountInfo> accountInfos = accountInfoMapper.selectAll();
        PageInfo<AccountInfo> pageInfo = new PageInfo<>(accountInfos);

				
		// TODO Auto-generated method stub
		return pageInfo;
	}
	
	
	@Override
	public List<AccountInstitution> selectAccountInstution() {
		// TODO Auto-generated method stub\		return null;
        return accountInstitutionMapper.selectAccountInstution();
	}

	@Override
	public List<AccountLevel> selectAccountLevel() {
		// TODO Auto-generated method stub\		return null;
        return accountLevelMapper.selectAccountLevel();
	}

	@Override
	public List<AccountPlatform> selectPlaceType() {
		// TODO Auto-generated method stub\		return null;
        return accountPlatformMapper.selectPlaceType();
	}
	
	@Override
	public List<AccountPlatformThridparty> selectThirdparty() {
		// TODO Auto-generated method stub\		return null;
        return accountPlatformThridpartyMapper.selectThirdparty();
	}

	@Override
	public List<AccountInstitutionType> selectAccountInstutionType() {
		// TODO Auto-generated method stub
		return accountInstitutionTypeMapper.selectAccountInstutionType();
	}

	@Override
	public List<AccountPlatform> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<AccountInfo> selectByExample(Object zhuti, Object leixing, Object pingtai, Object qudao, Object disanfang,int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		accountInfoExample = new AccountInfoExample();
		JSONArray zhutijson = (JSONArray) zhuti;
		JSONArray leixingjson = (JSONArray) leixing;
		JSONArray pingtaijson = (JSONArray) pingtai;
		JSONArray qudaojson = (JSONArray) qudao;
		JSONArray disanfangjson = (JSONArray) disanfang;
		createExample(zhutijson,"typename");
		createExample(leixingjson,"levelname");
		createExample(pingtaijson,"institutionname");
		createExample(qudaojson,"platformname");
		createExample(disanfangjson,"platformnamethird");
		PageHelper.startPage(pageNum,pageSize);
		List<AccountInfo> accountInfos = accountInfoMapper.selectByExample(accountInfoExample);
        PageInfo<AccountInfo> pageInfo = new PageInfo<>(accountInfos);

		System.out.println(pageInfo);
		
		
		return pageInfo;
	}
	
	public static void createExample(JSONArray array,String field) {
		if(array.length()!=0) {
			List fields = new ArrayList();
			for(int i=0;i<array.length();i++) {
				try {
					fields.add(array.getJSONObject(i).getString(field));
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				switch(field) {
				case "typename":accountInfoExample.or().andInstitutiontypeIn(fields);
				case "levelname":accountInfoExample.or().andAccounttypeIn(fields);
				case "institutionname":accountInfoExample.or().andInstitutionnameIn(fields);
				case "platformname":accountInfoExample.or().andAccountplaceIn(fields);
				case "platformnamethird":accountInfoExample.or().andThirdpartynameIn(fields);
				}
			}
		}
	}
}
