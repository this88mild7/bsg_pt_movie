package com.bsg.pt.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String main(Model model) throws ClassNotFoundException {
		List<Map<String, Object>> cateList = cateService.cateList();
		model.addAttribute("cateList", cateList);
		return "sidebar-view/main";
	}
	
	@RequestMapping(value = "sub.do")
	public String flowerplay(Model model) {
		return "sidebar-view/sub";
	}
	
	
	
}
