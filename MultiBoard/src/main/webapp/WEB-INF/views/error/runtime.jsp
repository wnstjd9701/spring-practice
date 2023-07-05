<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% response.setStatus(200); %>
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/views/include/staticFiles.jsp" />
<body>
<jsp:include page="/WEB-INF/views/include/bodyHeader.jsp" />
<div class="container">
<div class="content">
	<div class="jumbotron">
		<h2 style="color:red;">${exception.message}</h2>
		<p>
			<!-- Failed URL: ${url}
			Exception: ${exception.message}
			<c:foreach items="${exception.stackTrace}" var="ste">${ste}</c:foreach> -->
		</p>
		<p><a class="btn btn-primary" href="<c:url value='/'/>">HOME</a></p>
	</div>
</div>
</div>
<jsp:include page="/WEB-INF/views/include/footer.jsp" />
</body>
</html>