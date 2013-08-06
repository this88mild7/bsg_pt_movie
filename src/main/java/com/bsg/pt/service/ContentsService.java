package com.bsg.pt.service;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bsg.pt.dao.ContentsDao;

@Service
public class ContentsService {
	
	
	@Autowired
	ContentsDao contentsDao;
	
	private final String parentPath = "/var/lib/tomcat6/webapps/storyfarm/source/";
	
	
	
	/**
	 * 브랜드 리스트
	 * @return
	 */
	public List<Map<String, Object>> brandList(){
		return contentsDao.brandList();
	}

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
	public List<Map<String, Object>> listBybrandId(String cateId) {
		return contentsDao.listByBrandId(cateId);
	}

	/**
	 * 컨텐츠 생성
	 * @param contentsInfo
	 */
	public void createContents(Map<String, Object> contentsInfo) {
		
		// 새로운 브랜드라면 브랜드 생성 
		makeBrand(contentsInfo);
		
		// item_id make
		contentsInfo.put("item_id", itemIdMake());
		
		// 원본 파일 경로 생성
		contentsInfo.put("src_path", makeFilePath((MultipartFile)contentsInfo.get("file")));
		
		contentsDao.createContents(contentsInfo);
		
	}

	private String itemIdMake() {
		UUID uid = UUID.randomUUID();
		return uid.toString().replace("-", "");
	}

	private void makeBrand(Map<String, Object> contentsInfo) {
		if(contentsDao.hasNotBrand(contentsInfo)){
			contentsInfo.put("brand_id", UUID.randomUUID().toString().replace("-", ""));
			contentsDao.createBrand(contentsInfo);
		}
	}
	
	private String makeFilePath(MultipartFile file) {
		// 한글일 경우 생각 해야됨...
		System.out.println(file.getOriginalFilename());
		// brand 폴더 검사
		System.out.println(file.getOriginalFilename().split(".")[1]);
		
		String fileName = UUID.randomUUID().toString().replace("-", "")+file.getOriginalFilename().split(".")[1];
		
		try {
			byte fileData[] = file.getBytes();
			FileOutputStream fos = new FileOutputStream(parentPath + fileName);
			
			fos.write(fileData);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return parentPath + fileName;
	}
	
	public void writeFile(MultipartFile file, String path, String fileName){
		
		FileOutputStream fos=null;
		
        try{
         
            byte fileData[] = file.getBytes();
             
            fos = new FileOutputStream(path + "\\" + fileName);
             
            fos.write(fileData);
         
        }catch(Exception e){
             
            e.printStackTrace();
             
        }finally{
             
            if(fos != null){
                 
                try{
                    fos.close();
                }catch(Exception e){}
                 
                }
        }// try end;
         
    }// wirteFile() end;

}
