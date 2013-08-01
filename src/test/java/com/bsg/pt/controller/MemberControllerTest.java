package com.bsg.pt.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:servlet-contextForTest.xml"})
public class MemberControllerTest {
	
	@Autowired
    private RequestMappingHandlerAdapter handleAdapter;

    @Autowired
    private RequestMappingHandlerMapping handlerMapping;
    
    MockHttpServletRequest request = null;
    MockHttpServletResponse response = null;

    @Before
    public void tearUp() throws Exception {
    	request = new MockHttpServletRequest();
    	response = new MockHttpServletResponse();
    }

	@Test
	public void testAuth() throws Exception{

		// given 
		
        request.addParameter("member_id", "test1");
        request.addParameter("member_pw", "1234");
        request.setRequestURI("/auth.do");
        request.setMethod("POST");

		// when
        Object handler = handlerMapping.getHandler(request).getHandler();
        ModelAndView mav = handleAdapter.handle(request, response,handler);


		// then
        ModelAndViewAssert.assertViewName(mav,"redirect:main.do");

	}
	@Test
	public void testAuthFail() throws Exception{
		
		// given 
		request.addParameter("member_id", "test1");
		request.addParameter("member_pw", "12343");
		request.setRequestURI("/auth.do");
		request.setMethod("POST");
		
		// when
		Object handler = handlerMapping.getHandler(request).getHandler();
		ModelAndView mav = handleAdapter.handle(request, response,handler);
		
		
		// then
		ModelAndViewAssert.assertViewName(mav,"redirect:loginView.do");
		
	}

}
