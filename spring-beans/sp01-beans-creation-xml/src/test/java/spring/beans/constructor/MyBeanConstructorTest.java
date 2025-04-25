package spring.beans.constructor;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanConstructorTest {
	@Test
	public void demo() {
		
		try(var context=new GenericXmlApplicationContext("classpath:/application.xml")){
			
			var bean=context.getBean(MyBeanConstructor.class);
			bean.DefaultConstructor();
			
		}
		
	}

}
