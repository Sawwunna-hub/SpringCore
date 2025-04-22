package com.saw.ioccontainer;

import org.springframework.stereotype.Component;


public class HelloBean {
	

	
	private HelloBean() {
		super();

	}

	public String SayHello() {
		
		return "Hello Spring IoC Container!";
		
	}

}
