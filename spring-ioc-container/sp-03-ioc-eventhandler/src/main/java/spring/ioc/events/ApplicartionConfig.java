package spring.ioc.events;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = {"spring.ioc.events.listener","spring.ioc.events.publisher"})
public class ApplicartionConfig {

}
