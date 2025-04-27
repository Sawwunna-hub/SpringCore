package spring.beans.constructor;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyBeanConstructorTest {
	@Test
	public void demo() {
		try(var context=new GenericXmlApplicationContext("classpath:/application.xml")){
			//return Object from getBean
			var bean=(MyBeanConstructor)context.getBean("myBeanconstructor1");
			bean.BeanFromConstructor();
			
			context.getBean(MyBeanConstructor.class).BeanFromConstructor();
		
			
			
		}

	}

}
