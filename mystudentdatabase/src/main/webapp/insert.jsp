<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter the student details</h1>

	Records Insertion : ${result} 
	
	<form action="insert">
		Enter the id : <input type="text" name="id"><br> Enter
		the name: <input type="text" name="name"><br> <input
			type="submit">

	</form>


</body>
</html>