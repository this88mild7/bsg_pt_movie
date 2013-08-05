package com.bsg.pt.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bsg.pt.service.ContentsService;
import com.bsg.pt.service.ViewService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class ViewController {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewController.class);
	
	@Autowired
	private ViewService viewService;
	
	@Autowired
	private ContentsService contentsService;
	
	@RequestMapping(value = "/main.do")
	public String main(Model model, HttpServletRequest request) throws ClassNotFoundException {
		if(request.getSession().getAttribute("isLogin") == null){
			return "redirect:loginView.do";
		}
		boolean isLogin  = (Boolean)request.getSession().getAttribute("isLogin");
		if(isLogin)	{
			List<Map<String, Object>> cateList = viewService.cateList();
			model.addAttribute("cateList", cateList);
			return "sidebar-view/main";
		}else{
			return "redirect:loginView.do";
		}
	}
	
	@RequestMapping(value = "/sub.do")
	public String flowerplay(Model model, String cateId) {
		List<Map<String, Object>> cateList = viewService.cateList();
		List<Map<String, Object>> contentsList = contentsService.listByCateId(cateId);
		model.addAttribute("cateList", cateList);
		model.addAttribute("contensList", contentsList);
		return "sidebar-view/sub";
	}
	
}
