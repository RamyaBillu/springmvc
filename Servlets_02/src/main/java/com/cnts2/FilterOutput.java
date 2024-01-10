package com.cnts2;

import java.io.IOException;
import java.time.Instant;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FilterOutput implements Filter {

	

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		Instant before=Instant.now();
		System.out.println(before);
		Instant after=Instant.now();
		System.out.println(after);
		arg2.doFilter(arg0,arg1);
		System.out.println(before+""+after);
	}

	
		
	}

