package com.saran;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SaranServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		ServletConfig sc = getServletConfig();
		String orac =sc.getInitParameter("oracle");
		
		//pw.println("My driver name is +orac");
		
		Enumeration<String>   itr= sc.getInitParameterNames();
	  while(itr.hasMoreElements()){
	 String s = itr.nextElement();
	  pw.println("Name  "+s);
	  pw.println("Value "+sc.getInitParameter(s));
	 
	 
	  }	
		ServletContext ctx= getServletContext();
		String d = ctx.getInitParameter("oracle");
		pw.println("driver name is "+d);
		
	}

}
