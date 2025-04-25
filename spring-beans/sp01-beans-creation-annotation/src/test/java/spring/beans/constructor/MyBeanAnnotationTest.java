package spring.beans.constructor;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBeanAnnotationTest {
	
	@Test
	public void demo() {
		try(var context=new AnnotationConfigApplicationContext("spring.beans.constructor")){
			
			context.getBean(MyBeanAnnotation.class).DefaultConstructor();;
			
		}

	}

}
