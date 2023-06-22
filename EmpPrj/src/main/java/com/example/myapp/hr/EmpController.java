package com.example.myapp.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class EmpController {
	
	private IEmpService empService;
	
	@Autowired
	public EmpController(IEmpService empService) {
		this.empService = empService;
	}
	
	void printInfo() {
		int count = empService.getEmpCount(50);
		System.out.println("사원의 수 : " + count);
	}
}
