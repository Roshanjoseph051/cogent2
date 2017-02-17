package com.saran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/scope2")
public class TestScope2 extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		ServletContext ctx= getServletContext();
		String s1 =(String)ctx.getAttribute("Consulting");
		pw.println("<h1> This is Second Testscope, Hello to TestScope2</h1>");
		pw.println("the attribute value of TestScope"+s1);
	}

}
