package com.bsg.pt.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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
	public String play(String itemId, Model model) {
		List<Map<String, Object>> brandList = contentsService.brandList();
		Map<String, Object> contentsInfo = contentsService.infoByContentsId(itemId);
		model.addAttribute("brandList", brandList);
		model.addAttribute("src_path", contentsInfo.get("SRC_PATH"));
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
	
	@RequestMapping(value = "upload.do")
	public String upload(Model model,
			@RequestParam("item_file")MultipartFile file,
			@RequestParam("item_nm")String item_nm,
			@RequestParam("item_desc")String item_desc,
			@RequestParam("brand_nm")String brand_nm
			) {
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename().substring(file.getOriginalFilename().length()-3));
		System.out.println(file.getOriginalFilename().substring(0, file.getOriginalFilename().length()-4));
		Map<String, Object> contentsInfo = new HashMap<String, Object>();
		contentsInfo.put("file",file );
		contentsInfo.put("item_nm",item_nm );
		contentsInfo.put("item_desc",item_desc );
		contentsInfo.put("brand_nm",brand_nm );
		
		contentsService.createContents(contentsInfo);
		
		return "redirect:/main.do";
	}
	
	
}
