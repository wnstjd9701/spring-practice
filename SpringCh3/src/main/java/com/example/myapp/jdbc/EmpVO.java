package com.example.myapp.jdbc;

import java.sql.Date;

import lombok.Data;

@Data
public class EmpVO {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	Date hireDate;
	String jobId;
	double salary;
	double commissionPct;
	int managerId;
	int departmentId;
}
