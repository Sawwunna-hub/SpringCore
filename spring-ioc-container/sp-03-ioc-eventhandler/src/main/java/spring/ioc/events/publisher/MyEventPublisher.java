package spring.ioc.events.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import spring.ioc.events.MyEvent;

@Component
public class MyEventPublisher implements ApplicationEventPublisherAware{
	ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		
		this.publisher=applicationEventPublisher;
	}
	
	public void publish(MyEvent event) {
		publisher.publishEvent(event);

	}
	

}
