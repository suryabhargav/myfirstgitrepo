<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 


/* Object o=session.getAttribute("SES");
out.println("Hello:"+o.toString()+"<br/>");
out.println(session.isNew());
 */
 
 Cookie[]cookies=request.getCookies();
 for(int i=0;i<cookies.length;i++){
	 out.println(cookies[i].getName()+"------>");
 }
%>
 <a href="/WEB-INF/another_page.jsp">another page</a>
</body>
</html>