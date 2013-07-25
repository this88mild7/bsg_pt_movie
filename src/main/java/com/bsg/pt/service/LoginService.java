package com.bsg.pt.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bsg.pt.dao.LoginDao;
import com.bsg.pt.dto.LoginDTO;

@Service
public class LoginService {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private LoginDao loginDao;
	
	public boolean login(LoginDTO loginDTO) {
		
		//JSP에서 파라미터가 잘 넘어 왔는지 확인해 봅시다.
		logger.info(loginDTO.toString());
		
		String id = loginDTO.getId();
		String pwd = loginDTO.getPwd();
		if(id.equals("test1") && pwd.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
	
	public List<LoginDTO> getUserList() {
		return loginDao.getUserList();
	}
}
