package com.bsg.pt.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.bsg.pt.dto.LoginDTO;

@Component
public class LoginDao {
	
	public List<LoginDTO> getUserList() {
		
		ArrayList<LoginDTO> userList = new ArrayList<LoginDTO>();
		LoginDTO userList1 = new LoginDTO();
		userList1.setId("test1");
		userList1.setName("테스트1");
		userList1.setPwd("1234");
		userList1.setAccess("정회원");

		LoginDTO userList2 = new LoginDTO();
		userList2.setId("test2");
		userList2.setName("테스트2");
		userList2.setPwd("1234");
		userList2.setAccess("준회원");
		
		LoginDTO userList3 = new LoginDTO();
		userList3.setId("test3");
		userList3.setName("테스트3");
		userList3.setPwd("1234");
		userList3.setAccess("일반회원");
		
		userList.add(userList1);
		userList.add(userList2);
		userList.add(userList3);
		
		{
			//DB CONNECTION
			//return 메소드.selectList();
			
		}
		
		return userList;
	}
}
