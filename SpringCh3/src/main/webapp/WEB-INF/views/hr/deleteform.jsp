<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사원정보 삭제</h1>
<p>${emp.employeeId} 사원 ${emp.firstName} ${emp.lastName}의 정보를 삭제합니다.</p>
<p>삭제 후 데이터는 복구될 수 없습니다.</p>
${emp.employeeId} 사원의 이메일을 입력하세요.
<form action="./delete" method="post">
이메일 : <input type="text" name="email" required>
<input type="hidden" name="empid" value="${emp.employeeId}">
<input type="submit" value="삭제">
<p>${message}</p>
</form>
</body>
</html>