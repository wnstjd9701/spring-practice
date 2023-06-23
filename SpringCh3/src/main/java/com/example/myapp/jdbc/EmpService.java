package com.example.myapp.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class EmpService implements IEmpService{
	
	@Autowired
	IEmpRepository empRepository;
	
	@Override
	public int getEmpCount() {
		return empRepository.getEmpCount();
	}

	@Override
	public int getEmpCount(int deptid) {
		return empRepository.getEmpCount(deptid);
	}

	@Override
	public EmpVO getEmpInfo(int empid) {
		return empRepository.getEmpInfo(empid);
	}

	@Override
	public List<EmpVO> getEmpList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<Integer, String>> getAllDeptId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getAllJobId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmp(EmpVO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertEmp(EmpVO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmp(int empid, String email) {
		// TODO Auto-generated method stub
		
	}

}
