package com.saw.ioccontainer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloBeanTest {
	@org.junit.jupiter.api.Test
	void Test(){
		try(var context=new AnnotationConfigApplicationContext("com.saw.ioccontainer")){
			
			var bean=context.getBean(HelloBean.class);
			System.out.println(bean.sayHello());
			
		}
		
		
	}

}
