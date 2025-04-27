package spring.beans.method;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBeanMethodTest {

	@Test
	public void demo() {
		try(var context=new AnnotationConfigApplicationContext("spring.beans.method")){
			
			System.out.println(context.getBean("mytype2"));
			
		}

	}
	
}
