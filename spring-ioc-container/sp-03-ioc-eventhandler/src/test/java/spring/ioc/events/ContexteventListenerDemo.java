package spring.ioc.events;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.ioc.events.listener.ContextEventListener;

public class ContexteventListenerDemo {
	@Test
	public void Test() {
		try(var context=new AnnotationConfigApplicationContext(ContextEventListener.class)){
			
			
			
		}
		
		
	}

}
