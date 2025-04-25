package spring.beans.constructor;

import org.springframework.stereotype.Component;

@Component
public class MyBeanAnnotation {
	
	public void DefaultConstructor() {
		System.out.println("This Bean is created from default constructor");

	}
	
}
