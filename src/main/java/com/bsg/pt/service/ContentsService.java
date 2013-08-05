package com.bsg.pt.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsg.pt.dao.ContentsDao;

@Service
public class ContentsService {
	
	
	@Autowired
	ContentsDao contentsDao;

	/**
	 * 컨텐츠 상세 정보
	 * @param contentsID
	 * @return
	 */
	public Map<String, Object> infoByContentsId(String contentsID) {
		return contentsDao.infoByContentsId(contentsID);
	}

	/**
	 * 컨텐츠 리스트
	 * @param cateId
	 * @return
	 */
	public List<Map<String, Object>> listByCateId(String cateId) {
		return contentsDao.listByCateId(cateId);
	}

}
