package com.bsg.pt.main;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bsg.pt.category.CategoryService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private CategoryService cateService;
	
	@RequestMapping(value = "/main.do")
	public ModelAndView main() throws ClassNotFoundException {
		ModelAndView mav = new ModelAndView();
		List<Map<String, Object>> cateList = cateService.cateList();
		mav.addObject("cateList", cateList);
		mav.setViewName("main");
		
		// 카테고리 목록
		
		
		// 메인 타이틀
		
		// 서브 타이틀
		
		
//		boolean loginResult = loginService.login(loginDTO);
//		
//		if(loginResult) {
//			mav.addObject("userList", loginService.getUserList());
//			mav.setViewName("main");
//		} else {
//			//loginResult 가 1이 아니라면 
//			mav.setViewName("error");
//		}
		
		return mav;
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
}
