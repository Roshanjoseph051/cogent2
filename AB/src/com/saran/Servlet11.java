package com.saran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet11")
public class Servlet11  extends HttpServlet{

	public void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int x= Integer.parseInt(req.getParameter("a1"));
		int y= Integer.parseInt(req.getParameter("a2"));
		int z= x+y;
		PrintWriter pw=  res.getWriter();
		pw.println("the sum of x and y is"+z);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	processRequest(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		processRequest(req, res);
		}
	
	public void destroy(){
		System.out.println("destroy is called");
		
	}
	}

	

