package com.cnts;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Second extends GenericServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("i am init");
	}
	@Override
	public void destroy() {
		System.out.println("i am desy");
	}
	

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
      System.out.println("i am here");		
	}
	
	

}
