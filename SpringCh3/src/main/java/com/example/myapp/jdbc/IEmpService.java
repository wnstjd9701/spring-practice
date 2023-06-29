package com.example.myapp.jdbc;

import java.util.List;
import java.util.Map;

public interface IEmpService {
	List<EmpVO> getEmpList();
	List<Map<String, Object>> getAllDeptId();
	List<Map<String, Object>> getAllJobId();
	int getEmpCount();
	int getEmpCount(int deptid);
	EmpVO getEmpInfo(int empid);
	void updateEmp(EmpVO emp);
	void insertEmp(EmpVO emp);
	int deleteEmp(int empid, String email);
	List<Map<String, Object>> getAllManagerId();
}
