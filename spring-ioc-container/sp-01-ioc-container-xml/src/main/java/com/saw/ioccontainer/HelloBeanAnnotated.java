package com.saw.ioccontainer;

import org.springframework.stereotype.Component;

@Component
public class HelloBeanAnnotated {
	
	String sayHello() {
		
		return "Welcome From Annotated xml configuration";
	}

}
