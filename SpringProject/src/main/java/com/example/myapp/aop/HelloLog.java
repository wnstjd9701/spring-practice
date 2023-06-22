package com.example.myapp.aop;

import org.springframework.stereotype.Component;

import com.example.myapp.di.HelloService;

@Component
public class HelloLog extends HelloService{
	public static void log() {
		System.out.println(">>>LOG<<< : " + new java.util.Date());
	}
}
