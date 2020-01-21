package com.jdc.web.request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/protocol")
public class ProtocolServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Enumeration<String> headers = req.getHeaderNames();
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Header Informations</h1>");
		
		out.println("<div>");
		while(headers.hasMoreElements()) {
			String headerName = headers.nextElement();
			write(out, headerName, req.getHeader(headerName));
		}
		out.println("</div>");

		out.println("</body>");		
		out.println("</html>");
	}

	private void write(PrintWriter out, String headerName, String header) {
		out.println(String.format("%s : %s <br/>", headerName, header));
	}

}
