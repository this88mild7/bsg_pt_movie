package com.bsg.pt.service;

import org.junit.runners.Parameterized.Parameters;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {
	@RequestMapping(value = "index.do", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam("ID") String ID, @RequestParam("password") String password) {
		
		
		
		
		return new ModelAndView("index");
	}
}
