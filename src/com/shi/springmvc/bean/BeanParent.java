package com.shi.springmvc.bean;

public class BeanParent {

	private String country;
	private String language;
	private Bean bean;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Bean getBean() {
		return bean;
	}
	public void setBean(Bean bean) {
		this.bean = bean;
	}
	@Override
	public String toString() {
		return "BeanParent [country=" + country + ", language=" + language + ", bean=" + bean + "]";
	}
	
}
