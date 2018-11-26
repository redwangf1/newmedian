package com.alphonse.accountmanage.service;

import com.alphonse.accountmanage.entity.CommonUser;

public interface LoginService {
	public boolean selectByUsername(String username);
	public CommonUser selectByUsernameEntity(String username);

}
