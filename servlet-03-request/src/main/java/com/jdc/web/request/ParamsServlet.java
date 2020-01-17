package com.jdc.web.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/params")
public class ParamsServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String message = String.format("<h3>Request Name is %s</h3>", name);
		
		ServletResponse response = resp;

		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print(message);
		out.print("</body>");		
		out.print("</html>");
		
	}

}
