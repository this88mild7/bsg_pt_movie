package com.bsg.pt.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bsg.pt.service.ViewService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class ViewController {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewController.class);
	
	@Autowired
	private ViewService cateService;
	
	@RequestMapping(value = "/main.do")
	public ModelAndView main() throws ClassNotFoundException {
		ModelAndView mav = new ModelAndView();
		List<Map<String, Object>> cateList = cateService.cateList();
		mav.addObject("cateList", cateList);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value = "sub.do")
	public ModelAndView flowerplay() {
		ModelAndView mav = new ModelAndView("sub");
		return mav;
	}
	
	
	
}
