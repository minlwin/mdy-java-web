package com.jdc.life;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UseGeneric extends GenericServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("==============================");
		System.out.println("Generics Servlet Initialize!");
		System.out.println("==============================");
	}
	
	@Override
	public void destroy() {
		System.out.println("==============================");
		System.out.println("Generics Servlet Destroy!");
		System.out.println("==============================");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.getWriter().append("<h1>Generic Servlet</h1>");
	}

}
