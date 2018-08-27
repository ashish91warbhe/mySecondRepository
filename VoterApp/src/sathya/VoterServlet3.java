package sathya;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class VoterServlet3 extends GenericServlet

{
		@Override
		public void service(ServletRequest request,
				ServletResponse response) throws ServletException,
				IOException{
			//read user and age
			String s1=request.getParameter("user");
			String s2=request.getParameter("age");
			int i=Integer.parseInt(s2);
			PrintWriter out=response.getWriter();
			if(i>=18)
			{
				out.println("Hello" +s1);
				out.println("you are eligible to vote");
			}
			else
			{
				out.println("Hello" +s1);
				out.println("you are not eligible to vote");
			}
			out.close();
			
		}
}


