package com.shi.springmvc.handlers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/springmvc")
@Controller
public class TestRestPut {

	private String SUCCESS = "success";
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.PUT)
	public String testRestPut(@PathVariable(value="id") Integer id){
	    System.out.println("test put:" + id);
	    return SUCCESS;
	}
	     
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable(value="id") Integer id){
	    System.out.println("test delete:" + id);
	    return SUCCESS;
	}
	
	@RequestMapping(value="/testRest", method=RequestMethod.POST)
	public String testRestPost(){
	    System.out.println("test post");
	    return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.POST)
	public String testRestPost(@PathVariable(value="id") Integer id){
	    System.out.println("test post:" + id);
	    return SUCCESS;
	}
	     
	@RequestMapping(value="/testRest", method=RequestMethod.GET)
	public String testRestGet(){
	    System.out.println("test get");
	    return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.GET)
	public String testRestGet(@PathVariable(value="id") Integer id){
	    System.out.println("test get:" + id);
	    return SUCCESS;
	}
	
	@RequestMapping(value="/testRequestParam")
	public String testRequestParam(@RequestParam(value="username") String username, @RequestParam(value="age", required=false, defaultValue="0") int age){
	    System.out.println("testRequestParam" + " username:" + username + " age:" +age);
	    return SUCCESS;
	}
	
}
