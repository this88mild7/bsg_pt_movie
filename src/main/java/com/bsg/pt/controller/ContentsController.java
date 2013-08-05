package com.bsg.pt.controller;


import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bsg.pt.service.ContentsService;
import com.bsg.pt.service.ViewService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ContentsController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentsController.class);
	
	private String movieSrc = "/storyfarm/source/ani_song07.mp4";
	
	@Autowired
	ViewService viewService;
	
	@Autowired
	ContentsService contentsService;
	
	
	@RequestMapping(value = "play.do" )
	public String play(String contentsId, Model model) {
		List<Map<String, Object>> cateList = viewService.cateList();
		Map<String, Object> contentsInfo = contentsService.infoByContentsId(contentsId);
		model.addAttribute("cateList", cateList);
		model.addAttribute("contenstSrc", contentsInfo.get("contentsSrc"));
		return "sidebar-view/player";
	}
	
	@RequestMapping(value = "flowplayer.do")
	public String flowerplay(Model model) {
		model.addAttribute("contenstSrc", movieSrc);
		return "player-sidebar-view/flowplayer";
	}
	
	
	@RequestMapping(value = "jwplayer.do")
	public String jwplayer(Model model) {
		
		model.addAttribute("contenstSrc", movieSrc);
		return "player-sidebar-view/jwplayer";
	}
	
	@RequestMapping(value = "vimeo.do")
	public ModelAndView vimeo() {
		ModelAndView mav = new ModelAndView("player-sidebar-view/vimeo");
		return mav;
	}
	
	
}
