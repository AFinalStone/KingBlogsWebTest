package com.shi.springmvc.emp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeHandler {
	
	@Autowired
	 private EmployeeDao employeeDao;
	 
	    @RequestMapping("/emp_list")
	    public String list(Map<String, Object> map){
	        map.put("employees", employeeDao.getAll());
	        return "employee_list";
	    }
	    
}
