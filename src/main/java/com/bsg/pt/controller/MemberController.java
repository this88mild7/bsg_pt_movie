package com.bsg.pt.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bsg.pt.service.MemeberService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	private final String CODE = "code";
	private final String MSG = "msg";
	private final String SUCC_CODE = "200";
	private final String SUCC_MSG = "ok";
	
	@Autowired
	private MemeberService memberService;

	
	@RequestMapping(value = "loginView.do", method = RequestMethod.GET)
	public String loginView(Model model) {
		return "pure-member/login";
	}
	
	@RequestMapping(value = "joinView.do", method = RequestMethod.GET)
	public String joinView(Model model) {
		return "member/join";
	}
	@RequestMapping(value = "join.do", method = RequestMethod.GET)
	public String join(Model model) {
		return "member/login";
	}
	
	@RequestMapping(value = "auth.do", method = RequestMethod.POST)
	public String auth(Model model, HttpServletRequest request) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("member_id",request.getParameter("member_id"));
		paramMap.put("member_pw",request.getParameter("member_pw"));
		if(memberService.isAuth(paramMap)){
			return "redirect:main.do";
		}else{
			return "redirect:loginView.do";
		}
	}
	
	@RequestMapping(value = "facebooklogin.do", produces = "application/json;charset=UTF-8")
	public @ResponseBody String facebooklogin(String facebook_userID, String user_name, String user_email) {
		Map<String, String> facebookUserInfo = new HashMap<String, String>();
		facebookUserInfo.put("facebook_userID", facebook_userID);
		facebookUserInfo.put("user_name", user_name);
		facebookUserInfo.put("user_email", user_email);
		memberService.createFacebookAccount(facebookUserInfo);
		JSONObject json = new JSONObject();
		json.put(CODE, SUCC_CODE);
		json.put(MSG, SUCC_MSG);
		return json.toString();
	}
}
