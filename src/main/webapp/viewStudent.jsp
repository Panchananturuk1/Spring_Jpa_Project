<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>VIEW STUDENT PAGE</h1>

	${sdata} 
	
	ID: ${obj.sid} <br>
	AGE: ${obj.sage} <br>
	NAME: ${obj.sname} <br>
	
	 
	${StudentData}
	${sdata.sname}
	

	${sname}

</body>
</html>