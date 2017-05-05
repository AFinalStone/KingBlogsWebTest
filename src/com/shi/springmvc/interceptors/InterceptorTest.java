package com.shi.springmvc.interceptors;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorTest {

	private String SUCCESS = "success";

	@RequestMapping(value = "/testInterceptor")
	public String testInterceptor() {
		System.out.println("testInterceptor被执行");
		return SUCCESS;
	}

	@RequestMapping(value = "/testSecondInterceptor")
	public String testSecondInterceptor() {
		System.out.println("testSecondInterceptor被执行");
		return SUCCESS;
	}

}
