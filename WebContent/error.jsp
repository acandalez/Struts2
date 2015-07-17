<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
	<s:if test="hasActionErrors()">
		<s:actionerror />
	</s:if>
	<h1>Error!</h1>
	<p>Probando los actions</p>
	<s:form action="persona">
		<s:textfield name="nombre" />
		<s:textfield name="edad" />
		<s:submit />
	</s:form>
</body>
</html>