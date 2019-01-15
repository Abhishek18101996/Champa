<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Searched Employee Result</h3>



	<form method="POST" modelAttribute="editemployee" action="Editemp">
		
			<input type="text" id="name" name="employee_id"
				value="${person.employee_id}">
			<input type="text" id="name" name="emailAddress"
				value="${person.emailAddress}">
			<input type="text" id="name" name="firstName"
				value="${person.firstName}">
			<input type="text" id="name" name="hiredate"
				value="${person.hiredate}">
			<input type="text" id="name" name="jobId" value="${person.jobId}">
			<input type="text" id="name" name="department_id"
				value="${person.department_id}">
			<input type="text" id="name" name="lastName"
				value="${person.lastName}">
			<input type="text" id="name" name="phoneNumber"
				value="${person.phoneNumber}">
			<input type="text" id="name" name="salary" value="${person.salary}">
			<button type="submit" >Update</button>
		

	</form>
</body>
</html>