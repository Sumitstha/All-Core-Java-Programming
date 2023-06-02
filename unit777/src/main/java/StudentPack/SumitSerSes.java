package StudentPack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SumitSerSes")
public class SumitSerSes extends HttpServlet {protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	response.setContentType("text/html");   
	PrintWriter out= response.getWriter();
	String n= request.getParameter("uname");   
	out.print("welcome "+n);
	HttpSession session = request.getSession();   
	session.setAttribute("uname", n);   
	out.print("<a href='SumitSerSesRead'>Visit Here</a>"); 
}

}


