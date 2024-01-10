package com.cnts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieStore extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	Cookie[] cookie=req.getCookies();
	for(Cookie c1:cookie) {
		System.out.println(c1.getName()+" "+c1.getValue());
		Cookie cookie2=new Cookie("cookie-nandu", "cookie-milk");
		Cookie cookie3=new Cookie("cookie-Nani", "cookie-Sweet");
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		System.out.println(cookie3.getName()+" "+cookie3.getValue());
	}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
	HttpSession session1 = req.getSession(true);
	session1.setAttribute("session-info", "corenuts");
	System.out.println(session1.getId());
	System.out.println(session1.getMaxInactiveInterval());


}
}
