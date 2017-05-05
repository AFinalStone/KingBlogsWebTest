package com.shi.springmvc.bean;

public class Bean {

	private int age;
	private String name;
	private boolean flag;
	
	public Bean() {
		super();
	}

	public Bean(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Bean(int age, boolean flag) {
		super();
		this.age = age;
		this.flag = flag;
	}

	public Bean(int age, String name, boolean flag) {
		super();
		this.age = age;
		this.name = name;
		this.flag = flag;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Bean [age=" + age + ", name=" + name + ", flag=" + flag + "]";
	}
	
}
