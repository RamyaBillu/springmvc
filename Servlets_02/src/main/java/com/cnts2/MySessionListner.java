package com.cnts2;



	import javax.servlet.http.HttpSessionEvent;
	import javax.servlet.http.HttpSessionListener;

	public class MySessionListner implements HttpSessionListener {

		@Override
		public void sessionCreated(HttpSessionEvent se) {
			System.out.println("Session Id - " + se.getSession().getId());
			System.out
					.println("Session Creation Time - " + se.getSession().getCreationTime());
			System.out.println("Source - " + se.getSource());
		}

		@Override
		public void sessionDestroyed(HttpSessionEvent se) {
			System.out.println("Destroying session - " + se.getSession().getId());
		}

	}



