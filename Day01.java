package com.itbank.day01;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {
	
	@RequestMapping("/")
	public String home(HttpServletRequest request) {	// JSP 내장객체 request
		
		Date today = new Date();
		
		request.setAttribute("today", today);
		
		return "home";	// /WEB-INF/views/home.jsp로 포워드
						// 포워딩 시에는 request객체가 유지된다
						// test
	}
}