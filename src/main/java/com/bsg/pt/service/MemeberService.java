package com.bsg.pt.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bsg.pt.dao.MemberDao;

@Service
public class MemeberService {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private MemberDao loginDao;
	
	public boolean login(Map<String, String> loginMap) {
		
		//JSP에서 파라미터가 잘 넘어 왔는지 확인해 봅시다.
		
		String id = loginMap.get("id");
		String pwd = loginMap.get("pwd");
		if(id.equals("test1") && pwd.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
	
	public List<Map<String, String>> getUserList() {
		return loginDao.getUserList();
	}
}
