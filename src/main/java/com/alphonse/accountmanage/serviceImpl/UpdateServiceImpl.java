package com.alphonse.accountmanage.serviceImpl;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alphonse.accountmanage.dao.AccountInfoMapper;
import com.alphonse.accountmanage.dao.AccountVerifiedLogMapper;
import com.alphonse.accountmanage.entity.AccountInfo;
import com.alphonse.accountmanage.entity.AccountVerifiedLog;
import com.alphonse.accountmanage.service.UpdateService;
import com.alphonse.accountmanage.tool.TimeCreate;
@Service(value ="updateService")

public class UpdateServiceImpl implements UpdateService  {
	@Autowired
	private AccountInfoMapper accountInfoMapper;
	@Autowired
	private AccountVerifiedLogMapper verifiedLogMapper;
	@Autowired
	private HttpSession session;
	public UpdateServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int saveAccountInfo(AccountInfo accountInfo) {
		
		System.out.println(		session.getAttribute("username"));
		accountInfo.setExt1("create");
		accountInfo.setExt2("0");
		accountInfo.setUploadername((String) session.getAttribute("username"));
		accountInfo.setUpdatetime(new TimeCreate().getCurrentDate1());
		String uuid = UUID.randomUUID().toString();
		AccountVerifiedLog accountVerifiedLog = new AccountVerifiedLog();
		accountVerifiedLog.setExt1(uuid);
		accountVerifiedLog.setVerifiedlevel("0");
		accountVerifiedLog.setVerifiedstatus("false");
		accountInfo.setExt2(uuid);
		return accountInfoMapper.insert(accountInfo);

		
	}
}
