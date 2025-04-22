package spring.ioc.events;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.ioc.events.publisher.MyEventPublisher;

public class MyEventListenerDemo {
	@Test
	public void test() {

		
       try(var context=new AnnotationConfigApplicationContext(ApplicartionConfig.class)){
    	  
    	   var publisher=context.getBean(MyEventPublisher.class);
    	   publisher.publish(new MyEvent("This my first event"));
    	   
       }
		
	}

}
