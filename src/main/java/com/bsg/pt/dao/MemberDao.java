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
	
	public void createFacebookAccount(String facebook_userID) {
		int facebookIDCount = (Integer)getSqlSession().selectOne("member.facebookCount", facebook_userID);
		if(facebookIDCount == 0){
			getSqlSession().insert("member.facebookId", facebook_userID);
		}
	}

}
