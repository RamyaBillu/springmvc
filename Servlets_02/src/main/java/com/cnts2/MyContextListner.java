package com.cnts2;


	import javax.servlet.ServletContextEvent;
	import javax.servlet.ServletContextListener;

	public class MyContextListner implements ServletContextListener {

		@Override
		public void contextInitialized(ServletContextEvent sce) {
			System.out.println("Context Created");
		}

		@Override
		public void contextDestroyed(ServletContextEvent sce) {
			System.out.println("Context destroyed");
		}
	}



