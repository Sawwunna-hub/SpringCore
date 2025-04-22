package spring.ioc.events;

import java.time.LocalDateTime;

public record MyEvent(String message,LocalDateTime time) {
	
    public MyEvent(String message) {
		this(message,LocalDateTime.now());
	}

}
