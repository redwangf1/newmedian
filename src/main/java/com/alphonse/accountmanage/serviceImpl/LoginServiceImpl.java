package com.alphonse.accountmanage.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alphonse.accountmanage.dao.CommonUserMapper;
import com.alphonse.accountmanage.entity.CommonUser;
import com.alphonse.accountmanage.service.LoginService;
@Service(value ="loginService")

public class LoginServiceImpl implements LoginService{
	@Autowired
	private CommonUserMapper commonUserMapper; 
	public LoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}
		
	public boolean selectByUsername(String username)
	{
		CommonUser commonUser = commonUserMapper.selectByUsername(username);
		if(commonUser==null) {
			return false;
		}else {
			return true;
		}
	}
	
	public CommonUser selectByUsernameEntity(String username) {
		CommonUser commonUser = commonUserMapper.selectByUsername(username);
		return commonUser;
		
	}

	
}
