package com.jdc.web.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet-info")
public class ServletConfigInformations extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Header Informations</h1>");
		
		write(out, "getServerName", req.getServerName());
		write(out, "getServerPort", String.valueOf(req.getServerPort()));
		write(out, "getContentType", req.getContentType());
		write(out, "getAuthType", req.getAuthType());
		write(out, "getCharacterEncoding", req.getCharacterEncoding());
		write(out, "getContextPath", req.getContextPath());
		write(out, "getLocalAddr", req.getLocalAddr());
		write(out, "getLocalName", req.getLocalName());
		write(out, "getPathInfo", req.getPathInfo());
		write(out, "getPathTranslated", req.getPathTranslated());
		write(out, "getProtocol", req.getProtocol());
		write(out, "getQueryString", req.getQueryString());
		write(out, "getRemoteAddr", req.getRemoteAddr());
		write(out, "getRemoteHost", req.getRemoteHost());
		write(out, "getRemoteUser", req.getRemoteUser());
		write(out, "getRemotePort", String.valueOf(req.getRemotePort()));
		write(out, "getServletPath", req.getServletPath());
		out.println("<hr/>");
		
		ServletContext context = getServletContext();
		out.println(String.format("<h3>%s</h3>", "Servlet Context"));
		out.println("<div>");
		write(out, "getContextPath", context.getContextPath());
//		write(out, "getRequestCharacterEncoding", context.getRequestCharacterEncoding());
//		write(out, "getResponseCharacterEncoding", context.getResponseCharacterEncoding());
		write(out, "getServerInfo", context.getServerInfo());
		
		out.println("</div>");
		out.println("<hr/>");

		ServletConfig config = getServletConfig();
		out.println(String.format("<h3>%s</h3>", "Servlet Configuration"));
		out.println("<div>");
		write(out, "", config.getServletName());
		
		out.println("</div>");

		out.println("</body>");		
		out.println("</html>");		
	}

	private void write(PrintWriter out, String headerName, String header) {
		out.println(String.format("%s : %s <br/>", headerName, header));
	}

}
