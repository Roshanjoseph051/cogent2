package com.saran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCounter
 */
@WebServlet("/ServletCounter")
public class ServletCounter extends HttpServlet {
	
	int x;
	
	public void init(){
		x=1;
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter pw=  res.getWriter();
		
		pw.println(x);
		x++;
		
		
		
	}
	
	
}