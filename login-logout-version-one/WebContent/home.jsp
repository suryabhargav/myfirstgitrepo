<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="javax.naming.*" %>
<%@page import="javax.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%!
List<String> l=null;
%>


<%


try{
	Context ctx=new InitialContext();
	DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/ibm");
	Connection connection=ds.getConnection();
	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery("select usertype from userdetail");
	l=new ArrayList<String>();
	while(rs.next())
	{
		l.add(rs.getString("usertype"));
	}
	
}catch(Exception e){
	e.printStackTrace();
}
%>
</head>
<body>
<form id="form-1" action="loginController.do" method="post">
<label id="label-1">User Name:</label>
<input id="input-1"name="uName" placeholder=" username" autofocus="true" required="true" type="text"></br>

<label id="label-2">Password:</label>
<label for="input-2">User Password:</label>
<input id="input-2" placeholder=" Password" autofocus="true" required="true" type="text" name="uPass"></br>

<select name="uType">
<option value="UNKNOWN">select...</option>
<%
for(String str:l){%>
<option value=<%= str %>><%=str %></option>
<% }
%>

</select></br>
<input type="submit" value="log me in"id="button-1"/>
<input type="submit" value="cancel"id="button-2"/>
</form>>
</body>
</html>