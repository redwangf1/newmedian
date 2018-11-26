package com.alphonse.accountmanage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alphonse.accountmanage.entity.CommonUser;
import com.alphonse.accountmanage.service.LoginService;

@RestController
public class UserController {
	@Autowired
	private LoginService loginService; 
	@RequestMapping(value = "/user/info", method = {RequestMethod.POST, RequestMethod.GET})
	  public CommonUser currentUser(HttpServletRequest request, HttpSession session)  {
	     	String username = (String) session.getAttribute("username");
	     	
	     	System.out.println("已登录的用户"+username);
	     	System.out.println(loginService.selectByUsernameEntity(username));
			return loginService.selectByUsernameEntity(username);

	    }
}
