<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List,com.cognizant.model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>Display all the results
<form action="getall">

Click the button to view: <input type="submit">
</form>



<% 
	List<Student> students = (List<Student>)request.getAttribute("students");
	out.print(students);
	

		


%>


</body>
</html>