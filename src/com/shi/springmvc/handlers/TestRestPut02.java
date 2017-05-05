package com.shi.springmvc.handlers;

import java.util.Date;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/springmvc/put02")
@Controller
public class TestRestPut02 {

	private String SUCCESS = "success";
	
	@RequestMapping(value="/testRequestPOJO", method=RequestMethod.POST)
	public String testRequestPOJO(User user){
	    System.out.println("用户信息为:" + user);
	    return SUCCESS;
	}
	
	@RequestMapping(value="/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value="Accept-Language") String language){
	    System.out.println("testRequestHeader Accept-Languge:" + language);
	    return SUCCESS;
	}
	
	@RequestMapping(value="/testRestModelView")
	public ModelAndView  testRestModelView(){
	    ModelAndView modelAndView = new ModelAndView(SUCCESS+"02");
	    modelAndView.addObject("time", new Date());
	    System.out.println("testRestModelView执行成功");
	    return modelAndView;
	}
	
}
