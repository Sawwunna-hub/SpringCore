package com.saw.ioccontainer;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	
	public String sayHello() {
		
		return "Welcome from bean from annotation!";
	}

}
