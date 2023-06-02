package StudentPack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentServlet extends HttpServlet {
	Connection con;
	Statement statement;
	ResultSet set;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	int id=Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	
	
	out.println("My id is " + id + " and name is " + name +"." );
	
	//database connection
	
	try {
		con=new Database().getCon();
		statement=con.createStatement();
		String addstudent="INSERT INTO Student_tbl1" + " VALUES('"+id+"','"+name+"')";
		statement.executeUpdate(addstudent);
		set=statement.executeQuery("SELECT *FROM Student_tbl1");
		
		out.println("<table border='2'>");
		out.println("<th>ID</th>");
		out.println("<th>Name(/th>");
		
		while(set.next()) {
			out.println("<tr>");
			out.println("<td>"+set.getInt("id")+"</td>");
			out.println("<td>"+set.getString("studentname")+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}catch(ClassNotFoundException | SQLException e) {
		
	}
	
	
	}
	}
