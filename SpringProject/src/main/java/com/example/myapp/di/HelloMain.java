package com.example.myapp.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
//				new GenericXmlApplicationContext("application-config.xml");
		System.out.println("-----------------------");
		HelloController controller = context.getBean("helloController", HelloController.class);
		controller.hello("홍길동");
		System.out.println("=====================");
		context.close();
		}
}
