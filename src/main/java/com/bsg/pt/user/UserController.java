package com.bsg.pt.user;

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
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService loginService;

	
	@RequestMapping(value = "loginView.do", method = RequestMethod.GET)
	public ModelAndView loginView() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "joinView.do", method = RequestMethod.GET)
	public ModelAndView joinView() {
		return new ModelAndView("join");
	}
	@RequestMapping(value = "join.do", method = RequestMethod.GET)
	public ModelAndView join() {
		return new ModelAndView("join");
	}
	
	@RequestMapping(value = "auth.do", method = RequestMethod.GET)
	public ModelAndView auth() {
		return new ModelAndView("main");
	}

}
