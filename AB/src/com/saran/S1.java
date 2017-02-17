package com.saran;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S1")
public class S1 extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	res.setContentType("text/html");
	RequestDispatcher rd = req.getRequestDispatcher("S2");
	rd.forward(req, res);
		
		//res.sendRedirect("http://cogentinfo.com");
	
	
	
	
	
	}
	
}
