<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a new League</title>
</head>
<body>
<form action="add_customer.do" method="post">
		<table id="table-1">
		
			<tbody>
				<tr>
					<td>cName</td>
					<td>
						
						<input  name="name" placeholder="enter name " type="text"/>
					</td>
					
				</tr>
				<tr>
					<td>cadd</td>
					<td>
						
						<input  name="address" placeholder="enter address" type="text"/>
					</td>
					
				</tr>
				<tr>
					<td>Item</td>
					<td>
						<select name="item">
							<option value="UNKNOWN">Select...</option>
							<option value="mobile">mobile</option>
							<option value="laptop">laptop</option>
							<option value="headset">headset</option>
						</select>
					</td>
					
				</tr>
				
				<tr>
					
					<td>
						
						<input    type="submit" value="Add customer" onclick="return validateForm()"/>
					</td>
					
				</tr>
			</tbody>
			
		</table>
	
	
	</form>
	
	<jsp:include page="WEB-INF/list_customer.jsp"></jsp:include>

</body>
</html>