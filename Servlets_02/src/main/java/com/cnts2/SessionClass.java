package com.cnts2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionClass extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hii queen");
		HttpSession httpsession=req.getSession(true);
		httpsession.setAttribute("feuji","@123");
		System.out.println(httpsession.getId());
		System.out.println(httpsession.getMaxInactiveInterval());
		
	}
}
