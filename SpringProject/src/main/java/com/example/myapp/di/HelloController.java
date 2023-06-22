package com.example.myapp.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

public class HelloController {
	
	@Autowired
	@Qualifier("niceService")
	IHelloService service;
//	public HelloController() {};
	
// 	public HelloController(IHelloService helloService){
//		this.helloService = helloService;
//  }
	
	public void setHelloService(IHelloService helloService) {
		this.service = helloService;
	}
	
	public void hello(String name) {
		System.out.println("실행결과: " + service.sayHello(name));
	}
}
