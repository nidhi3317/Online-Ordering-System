<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<form:form method="post" modelAttribute="my_user">
 
  <!-- fieldsets -->
  <fieldset>
			<h3>LOG IN </h3>
			Enter Username: <form:input  path="email" placeholder="Enter Email"/>	<br>
			
			Enter Password:	<form:password path="pass" placeholder="password"/><br>
			<input type="submit" type="submit" name="login" value="LOG IN"  />
			<h4>New here?<a href="signup">Sign up</a></h4>  
	  </fieldset>
 </form:form>
</body>
</html>