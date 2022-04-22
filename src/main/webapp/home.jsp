<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="addStudent">
	
	Student Id:	<input type="text" name="sid"> <br>
	Student Age:<input type="number" name="age"> <br>
	Student Name:<input type="text" name="sname"> <br>
		<input type="submit"> <br>
		
	</form>
	
	<form action="getStudents">
		<input type="text" name="sid"> <br>
		<input type="submit"> <br>
		
	</form>

</body>
</html>