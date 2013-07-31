package com.bsg.pt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bsg.pt.service.MemeberService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemeberService loginService;

	
	@RequestMapping(value = "loginView.do", method = RequestMethod.GET)
	public String loginView(Model model) {
		return "view/login";
	}
	
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login(Model model) {
		return "view/login";
	}
	
	@RequestMapping(value = "joinView.do", method = RequestMethod.GET)
	public String joinView(Model model) {
		return "view/join";
	}
	@RequestMapping(value = "join.do", method = RequestMethod.GET)
	public String join(Model model) {
		return "view/main";
	}
	
	@RequestMapping(value = "auth.do", method = RequestMethod.GET)
	public String auth(Model model) {
		return "view/main";
	}

}
