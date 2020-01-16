package com.jdc.life;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/first")
public class FirstServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("==============================");
		System.out.println("First Servlet Initialize!");
		System.out.println("==============================");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.getWriter().append("<h1>Servlet Life cycle</h1>");
	}
	
	@Override
	public void destroy() {
		System.out.println("==============================");
		System.out.println("First Servlet Destroy!");
		System.out.println("==============================");
	}

}
