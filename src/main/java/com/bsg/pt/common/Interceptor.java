package com.bsg.pt.common;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter {

	private Logger logger = LoggerFactory.getLogger(Interceptor.class);

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) {
		
		try {
			long startTime = System.currentTimeMillis();
			request.setAttribute("startTime", startTime);

			printRequestLog(request);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {


	}

	private void printRequestLog(HttpServletRequest request) {
		try {
			StringBuffer sb = new StringBuffer();
			sb.append("[REQ]");
			sb.append("_IP_[" + request.getRemoteAddr() + "]");
			sb.append("_REQURL_[" + request.getServletPath() + "]");
			sb.append("_PARAM_[");

			// parameter
			Enumeration eNames = request.getParameterNames();
			while (eNames.hasMoreElements()) {
				String name = (String) eNames.nextElement();
				String[] values = request.getParameterValues(name);
				String paramIngo = "[" + name + " : ";
				for (int x = 0; x < values.length; x++) {
					if (x == 0) {
						// paramIngo += URLEncoder.encode(values[x], "UTF-8");
						paramIngo += values[x];
					} else {
						// paramIngo += ", "+URLEncoder.encode(values[x],
						// "UTF-8");
						paramIngo += ", " + values[x];
					}
				}

			}
			sb.append("]");
			logger.info(sb.toString());
		} catch (Exception e) {
			logger.error("{}", e);
		}
	}
}
