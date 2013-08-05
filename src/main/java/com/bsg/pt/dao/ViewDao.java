package com.bsg.pt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class ViewDao {
	
	List<String> tempCateList = new ArrayList<String>();
	
	public ViewDao(){
		tempCateList.add("유아");
		tempCateList.add("한글");
		tempCateList.add("수학");
		tempCateList.add("과학");
		tempCateList.add("게임");
	}

	public List<Map<String, Object>> cateList() {
		
		List<Map<String, Object>> cateList = new ArrayList<Map<String, Object>>();
		for(int x=0;x<tempCateList.size();x++){
			Map<String, Object> cate = new HashMap<String, Object>();
			cate.put("cateId", x);
			cate.put("cateName", tempCateList.get(x));
			cateList.add(cate);
		}
		return cateList;
	}
	
}
