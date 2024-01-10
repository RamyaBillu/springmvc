
package com.cnts2;

import javax.servlet.http.HttpServlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LocationController extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
			}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext servletContext = req.getServletContext();
		String username =servletContext.getInitParameter("username");
		String password = servletContext.getInitParameter("password");
		System.out.println(username + "," + password);

		
	}

}

	


