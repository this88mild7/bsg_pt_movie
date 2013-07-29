package com.bsg.pt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bsg.pt.dto.LoginDTO;
import com.bsg.pt.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	//LoginService loginService = new LoginService();

	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "join.do", method = RequestMethod.GET)
	public ModelAndView join() {
		return new ModelAndView("join");
	}
	
	@RequestMapping(value = "auth.do", method = RequestMethod.GET)
	public ModelAndView auth() {
		return new ModelAndView("main");
	}
	
	@RequestMapping(value = "/main.do")
	public ModelAndView login(LoginDTO loginDTO) throws ClassNotFoundException {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
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
