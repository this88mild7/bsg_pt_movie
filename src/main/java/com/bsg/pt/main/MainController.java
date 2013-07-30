package com.bsg.pt.main;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bsg.pt.category.CategoryService;
import com.bsg.pt.user.UserService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private CategoryService cateService;
	private UserService loginService;
	//LoginService loginService = new LoginService();
	
	@RequestMapping(value = "/main.do")
	public ModelAndView main() throws ClassNotFoundException {
		ModelAndView mav = new ModelAndView();
		List<Map<String, Object>> cateList = cateService.cateList();
		mav.addObject("cateList", cateList);
		mav.setViewName("main");
		
		// 카테고리 목록
		
		
		// 메인 타이틀
		
		// 서브 타이틀
		
		return mav;
	}
	
	
}
