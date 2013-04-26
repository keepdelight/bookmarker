package org.plab.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookMarkController extends BaseController {

	@Override
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		String dispatcherPath = null;
		
		if(getCurrentUser(request) == null) {
			response.sendRedirect("/home");
			return;
		}
		
		if (requestURI.equals("/bookmark/home")) {
			dispatcherPath = "/WEB-INF/view/bookmark/dashboard.jsp";
		}
		else if (requestURI.equals("/bookmark/add")) {
			if(request.getMethod().equals("GET")) {
				dispatcherPath = "/WEB-INF/view/bookmark/form.jsp";
			}
		}
		
		if(dispatcherPath != null) {
			ServletContext servletContext = getServletContext();
			RequestDispatcher dispatcher = servletContext.getRequestDispatcher(dispatcherPath);
			dispatcher.forward(request, response);
		}
	}
}
