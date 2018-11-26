package com.alphonse.accountmanage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alphonse.accountmanage.entity.CommonUser;
import com.alphonse.accountmanage.service.LoginService;
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService; 
	@RequestMapping(value="/loginPage")
	  public String login()  {
	        return "forward:login.html";
	    }

	@RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
	  public String login(HttpServletRequest request, HttpSession session)  {
	     String tno = request.getParameter("username");
	        String password = request.getParameter("password");
	        System.out.println("你输入的用户名为：" + tno);
	        System.out.println("你输入的密码为：" + password);
	        boolean tname = loginService.selectByUsername(tno);
	       
	        System.out.println(tname);
	        if (tname) {
	        	session.setAttribute("username", tno);
	            return "redirect:/index.html";
	        } else {
	            return "redirect:/loginfailure.html";
	        }

	    }

}
