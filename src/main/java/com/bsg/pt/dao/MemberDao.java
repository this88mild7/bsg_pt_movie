package com.bsg.pt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class MemberDao extends SqlSessionDaoSupport{
	
	public int memberCheckCount(Map<String, Object> userInfo){
		return (Integer)getSqlSession().selectOne("member.checkCount", userInfo);
	}
	
	public List<Map<String, String>> getUserList() {
		
		List<Map<String, String>> userList = new ArrayList<Map<String, String>>();
		
		HashMap<String, String> user1 = new HashMap<String, String>();
		user1.put("id", "test1");
		user1.put("name", "테스트1");
		user1.put("pwd", "1234");
		user1.put("access", "정회원");
		HashMap<String, String> user2 = new HashMap<String, String>();
		user2.put("id", "test2");
		user2.put("name", "테스트2");
		user2.put("pwd", "1234");
		user2.put("access", "준회원");
		HashMap<String, String> user3 = new HashMap<String, String>();
		user3.put("id", "test3");
		user3.put("name", "테스트3");
		user3.put("pwd", "1234");
		user3.put("access", "일반회원");

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		{
			//DB CONNECTION
			//return 메소드.selectList();
			
		}
		
		return userList;
	}

}
