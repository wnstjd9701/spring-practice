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
	<p><a href='<c:url value="/upload/new"/>'>업로드</a></p>
	<p><a href='<c:url value="/upload/list"/>'>파일 전체 목록</a></p>
	<p><a href='<c:url value="/upload/list/bigdata"/>'>빅데이터 목록</a></p>
	<p><a href='<c:url value="/upload/gallery"/>'>갤러리</a></p>
</body>
</html>