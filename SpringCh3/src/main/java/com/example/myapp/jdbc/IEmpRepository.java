package com.example.myapp.jdbc;

import java.util.List;
import java.util.Map;

public interface IEmpRepository {
	List<EmpVO> getEmpList();
	List<Map<Integer, String>> getAllDeptId();
	List<Map<String, Object>> getAllJobId();
	List<Map<String, Object>> getAllManagerId();
	int getEmpCount();
	int getEmpCount(int deptid);
	EmpVO getEmpInfo(int empid);
	void updateEmp(EmpVO emp);
	void insertEmp(EmpVO emp);
	void deleteJobHistory(int empid);
	int deleteEmp(int empid, String email);
	
}
