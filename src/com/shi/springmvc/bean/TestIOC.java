package com.shi.springmvc.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestIOC {

	private String SUCCESS = "success";
	
	//不实用Spring创建bean对象
	@RequestMapping("/createBean")
	private String createBean(){
		Bean bean = new Bean();
		bean.setAge(12);
		bean.setFlag(true);
		bean.setName("小灯笼");
		System.out.println(bean);
		return SUCCESS;
	}
	
	
	@RequestMapping("/getBeanByProperty")
	public String getBeanByProperty(){
		//创建 Spring 的 IOC 容器
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/bean.xml");
		//从容器中获取 bean 的实例，
		//注意，这里的beanByProperty是在beans.xml中配置过的，getBean后的名字必须要和beans.xml中定义的id名称一致
		//否则无法获取该HelloWorld bean的实例
		Bean bean = (Bean) ctx.getBean("beanByProperty");
		System.out.println(bean);
		return SUCCESS;
	}

	@RequestMapping("/getBeanByConstructor")
	public String getBeanByConstructor(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/bean.xml");
		Bean bean = (Bean) ctx.getBean("beanByConstructor");
		System.out.println(bean);
		return SUCCESS;
	}	
	
	@RequestMapping("/getBeanByConstructor01")
	public String getBeanByConstructor01(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/bean.xml");
		Bean bean = (Bean) ctx.getBean("beanByConstructor01");
		System.out.println(bean);
		return SUCCESS;
	}	
	
	@RequestMapping("/getBeanByConstructor02")
	public String getBeanByConstructor02(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/bean.xml");
		Bean bean = (Bean) ctx.getBean("beanByConstructor02");
		System.out.println(bean);
		return SUCCESS;
	}
	
	@RequestMapping("/getParentBeanByProperty01")
	public String getParentBeanByProperty01(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/bean.xml");
		BeanParent beanParent = (BeanParent) ctx.getBean("beanParentByProp01");
		System.out.println(beanParent);
		return SUCCESS;
	}
	
	@RequestMapping("/getParentBeanByProperty02")
	public String getParentBeanByProperty02(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/bean.xml");
		BeanParent beanParent = (BeanParent) ctx.getBean("beanParentByProp02");
		System.out.println(beanParent);
		return SUCCESS;
	}	

}
