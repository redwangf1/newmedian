package com.alphonse.accountmanage.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alphonse.accountmanage.dao.AccountInfoMapper;
import com.alphonse.accountmanage.entity.AccountInfo;
import com.alphonse.accountmanage.entity.AccountInstitution;
import com.alphonse.accountmanage.entity.AccountInstitutionType;
import com.alphonse.accountmanage.entity.AccountLevel;
import com.alphonse.accountmanage.entity.AccountPlatform;
import com.alphonse.accountmanage.entity.AccountPlatformThridparty;
import com.alphonse.accountmanage.service.AccountInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



@RestController

public class AccountController {
	@Autowired
	private AccountInfoService accountInfoService;

	@RequestMapping(value = "/account/info")
	public PageInfo<AccountInfo> findAll(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize){
        return accountInfoService.selectAll(pageNum,pageSize);

	}
	 
	@RequestMapping(value = "/account/{id}")
	public AccountInfo selectByPrimaryKey(@PathVariable("id") int id){
        return accountInfoService.selectByPrimaryKey(id);

	}
	
	@RequestMapping(value = "/account/institutionType")
	public List<AccountInstitutionType> initInstitutionType(){
		return accountInfoService.selectAccountInstutionType();
	}
	
	@RequestMapping(value = "/account/institution")
	public List<AccountInstitution> initInstitution(){
		return accountInfoService.selectAccountInstution();
	}
	
	@RequestMapping(value = "/account/level")
	public List<AccountLevel> initlevel(){
		return accountInfoService.selectAccountLevel();
	}
	
	@RequestMapping(value = "/account/platform")
	public List<AccountPlatform> initplatform(){
		return accountInfoService.selectPlaceType();
	}
	@RequestMapping(value = "/account/platformThirdparty")
	public List<AccountPlatformThridparty> initplatformThirdparty(){
		return accountInfoService.selectThirdparty();
	}
	
	@RequestMapping(value = "/account/platformall")
	public List<AccountPlatform> initplatformAll(){
		return accountInfoService.selectAll();
	}
	
	@RequestMapping(value = "/account/all")
	public List<AccountPlatform> initPageAll(){
		return accountInfoService.selectAll();
	}

//	public void initSearch(@RequestBody Map<String, Object> params) throws Exception{
//		System.out.println(params);
//		//System.out.println(leixing.length);
//		//System.out.println(pingtai.length);
//		//System.out.println(wangluo.length);
//
//		//return accountInfoService.selectAccountInstution();
//		
//	}
//	
	//@RequestMapping(value = "/account/example" ,method = RequestMethod.POST)
	@RequestMapping(value = "/account/example" )

	public PageInfo<AccountInfo> initSearch(
			@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize,
			@RequestParam("zhuti") JSONArray zhuti,
			@RequestParam("leixing") JSONArray leixing,
			@RequestParam("pingtai") JSONArray pingtai,
			@RequestParam("qudao") JSONArray qudao,
			@RequestParam("disanfang") JSONArray disanfang
							) throws Exception{
		
		System.out.println(zhuti);
		System.out.println(leixing);
		System.out.println(pingtai);
		System.out.println(qudao);
		System.out.println(disanfang);

		return accountInfoService.selectByExample(zhuti,leixing,pingtai,qudao,disanfang, pageNum, pageSize);
		//return accountInfoService.selectAccountInstution();
		
	}
}