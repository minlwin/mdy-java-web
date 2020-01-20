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
		
		String param = req.getParameter("param");
		param = String.format("<h3>%s</h3>", param);
		
		
		ServletResponse response = resp;

		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print(message);
		out.print(param);
		out.print("</body>");		
		out.print("</html>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Post Request</h1>");
		showParam("Text", req.getParameter("text"), out);
		showParam("Number", req.getParameter("number"), out);
		showParam("Date", req.getParameter("date"), out);
		showParam("Radio", req.getParameter("radio"), out);
		showParam("Sigle Select", req.getParameter("single"), out);
		showParam("Text Area", req.getParameter("longText"), out);
		
		showParam("Check Box", req.getParameterValues("checkbox"), out);
		showParam("Multi Select", req.getParameterValues("multi"), out);
		
		out.print("</body>");		
		out.print("</html>");
	}
	
	private void showParam(String key, String [] values, PrintWriter out) {
		String value = "";
		
		for(int i=0; i < values.length; i  ++) {
			if(i > 0) {
				value = value.concat(", ");
			}
			
			value = value.concat(values[i]);
		}
		
		showParam(key, value, out);
	}
	
	private void showParam(String key, String value, PrintWriter out) {
		out.print(String.format("%s : %s", key, value));
		out.print("<br />");
	}

}
