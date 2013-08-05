package com.bsg.pt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class ContentsDao {
	
	private String movieSrc = "/storyfarm/source/ani_song07.mp4";

	/**
	 * 컨텐츠 상세 정보
	 * @param contentsID
	 * @return
	 */
	public Map<String, Object> infoByContentsId(String contentsID) {
		Map<String, Object> contentsInfoMap = new HashMap<String, Object>();
		contentsInfoMap.put("contentsSrc", movieSrc);
		return contentsInfoMap;
	}

	/**
	 * 컨텐츠 리스트
	 * @param cateId
	 * @return
	 */
	public List<Map<String, Object>> listByCateId(String cateId) {
		List<Map<String, Object>> contentsList = new ArrayList<Map<String, Object>>();
		for(int x=0;x<6;x++){
			Map<String, Object> contsInfo = new HashMap<String, Object>();
			contsInfo.put("contentsSubnail", "/img/bag.jpg");
			contsInfo.put("contentsId", x);
			contentsList.add(contsInfo);
		}
		return contentsList;
	}
	
}
