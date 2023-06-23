package com.example.myapp.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository implements IEmpRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<EmpVO> getEmpList() {
		String sql="SELECT * FROM employees";
		return jdbcTemplate.query(sql, new RowMapper<EmpVO>() {

			@Override
			public EmpVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmpVO emp = new EmpVO();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				return emp;
			};
		});
	}

	@Override
	public List<Map<Integer, String>> getAllDeptId() {
		String sql = "SELECT department_id, department_name FROM departments";
		return jdbcTemplate.query(sql, new RowMapper<Map<Integer, String>>(){
			@Override
			public Map<Integer, String> mapRow(ResultSet rs, int rowNum) throws SQLException {
				Map<Integer, String> deptMap = new HashMap<Integer, String>();
				deptMap.put(rs.getInt("department_id"), rs.getString("department_name"));
				return deptMap;
			};
		});
	}

	@Override
	public List<Map<String, Object>> getAllJobId() {
		String sql = "SELECT job_id as jobId, job_title as jobTitle FROM jobs";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public int getEmpCount() {
		String sql = "Select COUNT(*) FROM employees";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public int getEmpCount(int deptid) {
		String sql = "SELECT COUNT(*) FROM employees WHERE department_id=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, deptid);
	}
	
	private class EmpMapper implements RowMapper<EmpVO>{

		@Override
		public EmpVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmpVO emp = new EmpVO();
			emp.setEmployeeId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setEmail(rs.getString("email"));
			emp.setPhoneNumber(rs.getString("phone_number"));
			emp.setHireDate(rs.getDate("hire_date"));
			emp.setJobId(rs.getString("job_id"));
			emp.setSalary(rs.getDouble("salary"));
			emp.setCommissionPct(rs.getDouble("commission_pct"));
			emp.setManagerId(rs.getInt("manager_id"));
			emp.setDepartmentId(rs.getInt("department_id"));
			return emp;
		}
		
	}
	@Override
	public EmpVO getEmpInfo(int empid) {
		String sql = "SELECT employee_id, first_name, last_name, " 
				+ " email, phone_number, hire_date, job_id, salary, "
				+ " commission_pct, manager_id, department_id"
				+ " FROM employees WHERE employee_id=?";
		return jdbcTemplate.queryForObject(sql, new EmpMapper(), empid); 
	}

	@Override
	public void updateEmp(EmpVO emp) {
		String sql = "UPDATE employees "
				+ " SET first_name=?, last_name=?, email=?, "
				+ " phone_number=? hire_date=?, manager_id=?, "
				+ " salary=?, commission_pct=?, manager_id=?, "
				+ " department_id=? WHERE employee_id=?";
		jdbcTemplate.update(sql,
				emp.getFirstName(), 
				emp.getLastName(), 
				emp.getEmail(), 
				emp.getPhoneNumber(), 
				emp.getHireDate(), 
				emp.getJobId(), 
				emp.getSalary(), 
				emp.getCommissionPct(), 
				emp.getManagerId(), 
				emp.getEmployeeId());
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
