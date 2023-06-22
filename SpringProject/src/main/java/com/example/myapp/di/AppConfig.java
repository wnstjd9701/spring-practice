package com.example.myapp.di;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@Configurable
@ComponentScan(basePackages= {"com.example.myapp"})
@ImportResource(value= {"classpath:application-config.xml"})
public class AppConfig {
		@Bean
		public IHelloService helloService() {
			return new HelloService();
		}
		
		@Bean
		public HelloController helloController() {
			HelloController controller = new HelloController();
			controller.setHelloService(helloService());
			return controller;
		}
}
