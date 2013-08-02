package com.bsg.pt.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ContentsController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentsController.class);
	
	private String movieSrc = "/storyfarm/source/ani_song07.mp4";
	private String swfSrc = "/storyfarm/source/book1_1.swf";
	
	@RequestMapping(value = "flowplayer.do")
	public ModelAndView flowerplay() {
		ModelAndView mav = new ModelAndView("sidebar-view/flowplayer");
		mav.addObject("movie", movieSrc);
		mav.addObject("swfSrc", swfSrc);
		return mav;
	}
	
	
	@RequestMapping(value = "jwplayer.do")
	public String jwplayer(Model model) {
		
		model.addAttribute("movie", movieSrc);
		model.addAttribute("swfSrc", swfSrc);
		return "sidebar-view/jwplayer";
	}
	
	@RequestMapping(value = "vimeo.do")
	public ModelAndView vimeo() {
		ModelAndView mav = new ModelAndView("sidebar-view/vimeo");
		return mav;
	}
	
	
}
