package StudentPack;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SumitServ") 
public class SumitServ extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");   
		PrintWriter out= response.getWriter();   
		String n= request.getParameter("uname");   
		out.print("welcome "+n);   
		Cookie ck= new Cookie("name", n); 
		ck.setMaxAge(60*60*24); 
		response.addCookie(ck); 
		out.print("<form action='SumitReadServlet' method='GET'>");   
		out.print("<input type='submit' value='GO'>");   
		out.print("</form>");   
		out.close(); 
	}

	

}
