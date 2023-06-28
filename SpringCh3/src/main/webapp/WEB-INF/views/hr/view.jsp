<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사원 정보 상세 조회</h1>
${message} 
<table border="1">
<tr>
	<th>EMPLOYEE_ID</th>
	<th>${emp.employeeId}</th>
</tr>
<tr>
	<th>FIRST_NAME</th>
	<th>${emp.firstName}</th>
</tr>
<tr>
	<th>LAST_NAME</th>
	<th>${emp.lastName}</th>
</tr>
<tr>
	<th>EMAIL</th>
	<th>${emp.email}</th>
</tr>
<tr>
	<th>PHONE_NUMBER</th>
	<th>${emp.phoneNumber}</th>
</tr>
<tr>
	<th>HIRE_DATE</th>
	<th>${emp.hireDate}</th>
</tr>
<tr>
	<th>JOB_ID</th>
	<th>${emp.jobId}</th>
</tr>
<tr>
	<th>SALARY</th>
	<th>${emp.salary}</th>
</tr>
<tr>
	<th>COMMISSION_PCT</th>
	<th>${emp.commissionPct}</th>
</tr>
<tr>
	<th>MANAGER_ID</th>
	<th>${emp.managerId}</th>
</tr>
<tr>
	<th>DEPARTMENT_ID</th>
	<th>${emp.departmentId}</th>
</tr>
</table>
<a href="update?empid=${emp.employeeId}">수정하기</a>
<a href="delete?empid=${emp.employeeId}">삭제하기</a>
</body>
</html>