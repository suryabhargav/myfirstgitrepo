<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="pBean" scope="request" class="comm.examplemodel.Player" ></jsp:useBean>
<jsp:setProperty name="pBean" property="*" />
<jsp:getProperty name="pBean" property="name" />
<jsp:getProperty name="pBean" property="team" />
<jsp:getProperty name="pBean" property="country" />

</body>

</html>