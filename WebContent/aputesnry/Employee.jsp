<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello Employee!</title>
</head>
<body>
<h3>
	<s:if test=employee>El empleado con ID <a style="color:#FF0000">
							<s:property value="employee.employee_id"/></a> es
						<a style="color:#0000FF">
							<s:property value="employee.first_name"/> 
	   						<s:property value="employee.last_name"/></a> con un salario de
	   					<a style="color:#04B431">
	   						<s:property value="employee.salary"/></a> dólares al año.
	</s:if>
</h3>
</body>
</html>