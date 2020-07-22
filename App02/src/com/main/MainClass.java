package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MainClass implements Servlet {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter=response.getWriter();
		printWriter.print("<h1>Welcome to servlet</h1><br>");
		printWriter.print("<h1>Welcome to servlet</h1><br>");
		printWriter.print("<h1>Welcome to servlet</h1><br>");
		printWriter.print("<h1>Welcome to servlet</h1><br>");
		
	}

}