package com.bsg.pt.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


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
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "auth.do", method = RequestMethod.GET)
	public ModelAndView auth() {
		return new ModelAndView("redirect:/main.do");
	}
	
	@RequestMapping(value = "join.do", method = RequestMethod.GET)
	public ModelAndView join() {
		return new ModelAndView("join");
	}
}
