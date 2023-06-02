package StudentPack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SumitReadServlet") 
public class SumitReadServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");   
		PrintWriter out= response.getWriter();   
		Cookie[] ck= request.getCookies();
		if(ck!=null)
		{
			out.println("Hello"+ck[0].getValue());
			out.close();
		}
	}

}
