package sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,
			    IOException 
	{

		//set mime type
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//read first name
		String firstName=request.getParameter("fname");
		//create cookie and store firstname in cookie
		Cookie c1=new Cookie("first",firstName);
		//set expire as 30 seconds
		c1.setMaxAge(30);
		//add cokie to response object
		response.addCookie(c1);
		//design  form
		out.println("<center>");
		out.println("<form action='v2'>");
		out.println("LastName:<input type=text name='lname'>");
		out.println("<br>");
		out.println("<input type=submit value='submit'>");
		out.println("</form></center>");
		out.close();
		
		
	}

}
