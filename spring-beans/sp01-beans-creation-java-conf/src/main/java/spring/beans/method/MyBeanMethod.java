package spring.beans.method;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanMethod {

	@Bean({"mytype","mytype2"})
	public MyType BeanFromInstanceMethod() {
		
		
		return new MyType("saw wunna aye");
	}
}
