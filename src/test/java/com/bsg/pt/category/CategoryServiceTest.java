package com.bsg.pt.category;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:servlet-contextForTest.xml"})
public class CategoryServiceTest {
	
	@Autowired
	private CategoryService cateService;


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCateList() {

		// given 

		// when
		List<Map<String, Object>> cateList = cateService.cateList();

		// then
		assertThat(cateList, is(notNullValue()));
		assertThat(cateList.size(), is(not(0)));
		printMapList(cateList);
		
		
		
	}
	
	private void printMapList(List<Map<String, Object>> mapList){
		for(Map<String, Object> map : mapList){
			Iterator<String> iterator = map.keySet().iterator();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();
				System.out.print(key+"="+map.get(key)); 
			}
			System.out.println(); 
		}
	}

}
