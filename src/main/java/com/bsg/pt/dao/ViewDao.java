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
		tempCateList.add("BoomBoomEnglish");
		tempCateList.add("이야기나라");
		tempCateList.add("동요나라");
	}

	
	
}
