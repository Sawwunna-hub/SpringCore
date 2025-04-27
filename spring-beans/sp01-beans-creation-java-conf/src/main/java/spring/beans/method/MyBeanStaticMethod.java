package spring.beans.method;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanStaticMethod {

	@Bean
	public MyType BeanFromStaticMethod() {
		
		
		return new MyType("Saw in static mode");
	}
	
	
}
