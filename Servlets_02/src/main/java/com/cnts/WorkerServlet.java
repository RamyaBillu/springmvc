package com.cnts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WorkerServlet extends HttpServlet {
		
			//@Override
//			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
//			ObjectMapper objectMapper = new ObjectMapper();
//				
//			List<Worker>list=WorkerTest2.fetch();
//			String str=objectMapper.writeValueAsString(list);
//			PrintWriter printWriter =resp.getWriter();
//			printWriter.print(str);
			@Override
			protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			     String id=req.getParameter("id");
				DeleteClass.delete(Integer.parseInt(id));	
			}
				
		}



