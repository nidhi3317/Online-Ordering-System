<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGN UP</title>
</head>
<body>
<form:form method="post" modelAttribute="my_user">

  <!-- fieldsets -->
  <fieldset>
   <center>
    <h2>Sign up here </h2> 
  </center>
    	 
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<tr>
    <td align='center'>Name:</td>
    <td><form:input type='text' path="name"/></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

<!-- <tr>
    <td align='center'>Last Name:</td>
    <td><input type='text' name='lname'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
 -->
<tr>
    <td align='center'>Password:</td>
    <td><form:password type='text' path="pass"/></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Email:</td>
    <td><form:input  type='text' path="email"/></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<!-- 
<tr>
    <td align='center'>Confirm Password:</td>
    <td><input type='text' name='name'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

<tr>
    <td align='center'>Street:</td>
    <td><input type='text' name='name'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>City:</td>
    <td><input type='text' name='name'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

-->

<tr>
    <td align='center'><input type='submit' name='signup' value="SIGN UP"></td>
</tr> 
</table>
</table>
  </fieldset>
  </form:form>
</body>
</html>