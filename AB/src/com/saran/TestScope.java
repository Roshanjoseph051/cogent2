package com.saran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/scope1")

public class TestScope extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		ServletContext ctx= getServletContext();
		ctx.setAttribute("Consulting","Cogent");
		pw.println("<h1>This is First Scope</h1>");
		pw.println("<a href = 'scope2'>click here</a>");
		

}
}
