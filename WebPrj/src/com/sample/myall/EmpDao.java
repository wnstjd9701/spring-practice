package com.sample.myall;

public class EmpDao {
	public EmpVO getData() {
		// SQL 구문이 있다고 가정.
		EmpVO emp = new EmpVO();
		emp.setData("Hello");
		return emp;
	}
}
