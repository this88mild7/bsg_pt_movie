package com.bsg.pt.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ContentsController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentsController.class);
	
	private String movieSrc = "/movie/source/ani_song07.mp4";
	private String swfSrc = "/movie/source/book1_1.swf";
	
	@RequestMapping(value = "flowplayer.do")
	public ModelAndView flowerplay() {
		ModelAndView mav = new ModelAndView("view/flowplayer");
		mav.addObject("movie", movieSrc);
		mav.addObject("swfSrc", swfSrc);
		return mav;
	}
	
	
	@RequestMapping(value = "jwplayer.do")
	public ModelAndView jwplayer() {
		
		ModelAndView mav = new ModelAndView("jwplayer");
		mav.addObject("movie", movieSrc);
		mav.addObject("swfSrc", swfSrc);
		return mav;
	}
	
	
}
