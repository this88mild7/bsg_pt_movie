package com.bsg.pt;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MovieController {
	
	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	private String movieSrc = "/movie/ani_song07.mp4";
	
	@RequestMapping(value = "flowplayer.do")
	public ModelAndView flowerplay() {
		ModelAndView mav = new ModelAndView("flowplayer");
		mav.addObject("movie", movieSrc);
		return mav;
	}
	
	
	@RequestMapping(value = "jwplayer.do")
	public ModelAndView jwplayer() {
		
		ModelAndView mav = new ModelAndView("jwplayer");
		mav.addObject("movie", movieSrc);
		return mav;
	}
	
	
}
