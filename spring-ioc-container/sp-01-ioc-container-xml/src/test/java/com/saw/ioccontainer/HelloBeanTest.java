package com.saw.ioccontainer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class HelloBeanTest {
	@org.junit.jupiter.api.Test
	void Test() {
		
		try(var context=new GenericXmlApplicationContext()){
			context.load("classpath:/application.xml");
			context.refresh();
			var bean=context.getBean(HelloBean.class);			
			System.out.println(bean.SayHello());
			
			
			var beanAnnotated=context.getBean(HelloBeanAnnotated.class);
			System.out.println(beanAnnotated.sayHello());
			
			
		}
		
	}

}
