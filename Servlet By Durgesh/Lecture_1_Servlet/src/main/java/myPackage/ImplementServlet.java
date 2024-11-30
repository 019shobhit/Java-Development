package myPackage;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(("/first"))
public class ImplementServlet implements Servlet {
	
	private ServletConfig servletConfig;
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.servletConfig=servletConfig;
		System.out.println("Servlet is Initlizing:");

	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service method is reunning:");
		
	}

	@Override
	public void destroy() {
		System.out.println("Servlet is Destroyrd");
	}

	@Override
	public ServletConfig getServletConfig() {
		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		return "This Servlet is Created by shobhit Chauhan";
	}
}
