package com.saran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test143
 */
@WebServlet("/S2")
public class S2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println();
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		pw.println("forwarding S1 to S2");
		pw.println("again  forwarding S1 to S2");
	
}
}