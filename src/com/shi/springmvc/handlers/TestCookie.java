package com.shi.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestCookie {

	private String SUCCESS = "success";
	
	@RequestMapping(value="/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String cookieValue){
	    System.out.println("testCookieValue: " + cookieValue);
	    return SUCCESS;
	}
}
