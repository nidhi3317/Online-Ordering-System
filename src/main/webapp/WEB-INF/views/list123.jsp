<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Vendor List</h3>
<c:forEach var="v" items="${requestScope.vendor_list}">
${v.id} &nbsp;${v.name} &nbsp; ${v.regAmount} &nbsp; ${v.phoneNo} <br/>
</c:forEach>
</body>
</html>