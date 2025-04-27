package spring.beans.constructor;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanConstructorArgTest {
	
	@Test
	public void demo() {
		try(var context = new GenericXmlApplicationContext("classpath:/application.xml")){
			
			System.out.println(context.getBean(MyBeanConstructorArg.class).name);
			
		}
		
	}

}
