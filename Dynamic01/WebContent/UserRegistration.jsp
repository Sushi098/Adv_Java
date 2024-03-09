<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="Header.jsp"%>
	<%
		String succ = (String) request.getAttribute("succ");
		String error = (String) request.getAttribute("error");
	%>
	<%
		if (succ != null) {
	%>
	<%=succ%>
	<%
		}
	%>
	<center>
		<%
			if (succ != null) {
		%>
		<%=succ%>
		<%
			}
		%>
		<%
			if (error != null) {
		%>
		<%=error%>
		<%
			}
		%>



		<form action="UserRegistrationCtl" method="post">
			<table align="center" style="padding: 10%">
				<tr>
					<th>First Name</th>
					<td><input type="text" name="firstName"></td>
				</tr>

				<tr>
					<th>Last Name</th>
					<td><input type="text" name="lastName"></td>
				</tr>

				<tr>
					<th>loginId</th>
					<td><input type="email" name="loginId"></td>
				</tr>

				<tr>
					<th>password</th>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<th>phoneNo</th>
					<td><input type="text" name="phoneNo"></td>
				</tr>

				<tr>
					<th>dob</th>
					<td><input type="date" name="dob"></td>
				</tr>

				<tr>
					<th>gender</th>
					<td><input type="text" name="gender"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit"></td>
				</tr>
			</table>

		</form>
</body>
</html>