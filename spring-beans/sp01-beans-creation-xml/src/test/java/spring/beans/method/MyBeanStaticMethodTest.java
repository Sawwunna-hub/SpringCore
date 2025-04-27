package spring.beans.method;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanStaticMethodTest {

	@Test
	public void demo() {
		try(var context=new GenericXmlApplicationContext("classpath:/application.xml")){
			
			System.out.println(context.getBean(String.class));
		}

	}
	
}
