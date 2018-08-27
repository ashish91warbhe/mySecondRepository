package sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet2 extends HttpServlet
{

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, IOException 
	{
	
//set mime type
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//read cookie from request object
		Cookie cookies[]=request.getCookies();
		String firstName="";
		if (cookies!=null)
		{
			firstName=cookies[0].getValue();
		}
		//read lastname
		String lastName=request.getParameter("lname");
		out.println(firstName+"" +lastName);
		out.close();
		
		
	}

}
