package spring.beans.method;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBeanStaticMethodTest {
	@Test
	public void demo() {
		try(var context=new AnnotationConfigApplicationContext(MyBeanStaticMethod.class)){
			context.getBean(MyType.class);
			
		}

	}
	


}
