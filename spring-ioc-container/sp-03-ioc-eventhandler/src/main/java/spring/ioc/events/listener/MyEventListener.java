package spring.ioc.events.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import spring.ioc.events.MyEvent;

@Component
public class MyEventListener {
	@EventListener
	public void ListenMyEvent(MyEvent event) {
		
		System.out.println(event);
	}

}
