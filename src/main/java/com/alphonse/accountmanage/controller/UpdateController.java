package com.alphonse.accountmanage.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alphonse.accountmanage.entity.AccountInfo;
import com.alphonse.accountmanage.service.AccountInfoService;
import com.alphonse.accountmanage.service.UpdateService;
@RestController
public class UpdateController {
	
	@Autowired
	private UpdateService updateService;
	
    @RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveInfo(AccountInfo accountInfo, HttpServletResponse response ) {
		//System.out.println(accountInfo);
		updateService.saveAccountInfo(accountInfo);
        try {
			response.sendRedirect("/add.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "success";
	}
    
    void handleFoo(HttpServletResponse response) throws IOException {
        response.sendRedirect("some-url");
      }
	public UpdateController() {
		// TODO Auto-generated constructor stub
	}
}
