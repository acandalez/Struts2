<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Basi Application Struts 2 - Welcome</title>
</head>
<body>
<h1>Welcome To Struts 2!</h1>
<p><a href="<s:url action='person'/>">¿Quién soy?</a></p>

<p><a href="<s:url action='person'/>">¿Quién soy a traves del interceptor</a></p>

<s:form action="person">
	<s:textfield label="Nombre" name="name"></s:textfield>
	<s:textfield label="Edad" name="age"></s:textfield>
	<s:submit></s:submit>
</s:form>

<h2>Introduzca Id Empleado: </h2>

	<s:form action="employee">
		<s:textfield label="Id Empleado" name="idEmpleado"></s:textfield>
		<s:submit value = "CONSULTAR"></s:submit>
	</s:form>

<h3>Introduzca datos del coche: </h3>
	
	<s:form action="car">
		<s:textfield label="Marca" name="car"></s:textfield>
		<s:textfield label="Modelo" name="car"></s:textfield>
		<s:textfield label="Matrícula" name="car"></s:textfield>
		<s:textfield label="Color" name="car"></s:textfield>
		<s:submit value = "ENVIAR"></s:submit>
	</s:form>

</body>
</html>