package com.example.myapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class HelloLog {
	public static void log(JoinPoint joinPoint) {
		System.out.println(">>>LOG<<< : " + new java.util.Date());
		Signature s = joinPoint.getSignature();
		System.out.println("핵심코드 메서드 이름: " + s.getName());
		System.out.println("타입 : " + s.getDeclaringTypeName());
	}
}
