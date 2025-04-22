package spring.ioc.events.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextEventListener {

	 @EventListener
     public void eventListener(ApplicationContextEvent event) {
    	 System.out.println(event.getClass().getSimpleName());
		 
     }
}
