package com.example.myapp.aop;

public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
//		HelloLog.log(); // 횡단 관점 <-- AOP는 이것도 없애자.
		return "Hello~" + name;
	}

	@Override
	public String sayGoodbye(String name) {
		return "Bye~" + name;
	}

}
