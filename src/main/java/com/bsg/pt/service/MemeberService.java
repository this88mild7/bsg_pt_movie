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
	private MemberDao memberDao;
	
	public List<Map<String, String>> getUserList() {
		return memberDao.getUserList();
	}

	public boolean isAuth(Map<String, Object> asMap) {
		if(memberDao.memberCheckCount(asMap) == 0){
			return false;
		}else{
			return true;
		}
	}
}
