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
public class ContentsDao extends SqlSessionDaoSupport{
	
	private String movieSrc = "/storyfarm/source/ani_song07.mp4";

	/**
	 * 컨텐츠 상세 정보
	 * @param contentsID
	 * @return
	 */
	public Map<String, Object> infoByContentsId(String itemId) {
		return (Map<String, Object>)getSqlSession().selectOne("contents.infoByContentsId", itemId);
	}

	/**
	 * 컨텐츠 리스트
	 * @param cateId
	 * @return
	 */
	public List<Map<String, Object>> listByBrandId(String brandId) {
		return (List<Map<String, Object>>)getSqlSession().selectList("contents.listByBrandId", brandId);
	}

	public List<Map<String, Object>> brandList() {
			return (List<Map<String, Object>>)getSqlSession().selectList("contents.brandList");
	}

	public void createContents(Map<String, Object> contentsInfo) {
		getSqlSession().insert("contents.createContents", contentsInfo);
	}

	public boolean hasNotBrand(Map<String, Object> contentsInfo) {
		int brandCheckCount = (Integer)getSqlSession().selectOne("contents.brandCheckCount", contentsInfo);
		if(brandCheckCount > 0){
			return false;
		}else{
			return true;
		}
	}

	public void createBrand(Map<String, Object> contentsInfo) {
		getSqlSession().insert("contents.createBrand", contentsInfo);
	}

	public String brandIdByBrandNm(String brandNm) {
		return (String)getSqlSession().selectOne("contents.brandIdByBrandNm", brandNm);
	}
}
