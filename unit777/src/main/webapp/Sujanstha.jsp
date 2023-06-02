<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book JSP</title>
<%@page import="StudentPack.Database"%>
<%@page import="java.sql.*"%>
</head>
<body>
	<%
	String isbn = request.getParameter("isbn");
	String title = request.getParameter("title");
	String author = request.getParameter("author");
	int price = Integer.parseInt(request.getParameter("price"));
	String edition = request.getParameter("edition");
	String publication = request.getParameter("publication");
	Connection con = new Database().getCon();

	Statement statement = con.createStatement();
	ResultSet set;
	String insert = "INSERT INTO Sujanb_tbl VALUES('" + isbn + "','" + title + "','" + author + "','" + price + "','"
			+ edition + "','" + publication + "')";
	statement.executeUpdate(insert);
	set = statement.executeQuery("SELECT * FROM Sujanb_tbl");
	%>
	<table >
		<tr>
			<th>isbn</th>
			<th>title</th>
			<th>author</th>
			<th>price</th>
			<th>edition</th>
			<th>publication</th>
		</tr>
		<%
		while (set.next()) {
			out.println("<tr>");
			out.println("<td>" + set.getString("isbn") + "</td>");
			out.println("<td>" + set.getString("title") + "</td>");
			out.println("<td>" + set.getString("author") + "</td>");
			out.println("<td>" + set.getInt("price") + "</td>");
			out.println("<td>" + set.getString("edition") + "</td>");
			out.println("<td>" + set.getString("publication") + "</td>");
			out.println("</tr>");
		}
		%>
	</table>
</body>
</html>