<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/jsoa/ui/js/jquery-1.11.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>name</th>
<th>age</th>
</tr>
<c:forEach items="${userModelList}" var="userInfo">
<tr>
<td>${userInfo.userName }</td>
<td>${userInfo.userAge }</td>
</tr>
</c:forEach>
</table>

success!
</body>
</html>