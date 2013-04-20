package org.plab.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// getcurrentuser는 basecontroller에서 처리!
public class HomeController extends HttpServlet {

	protected void doProcess(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		String dispatcherPath = null;
		
		System.out.println("requestURI : " + requestURI);

		if (requestURI.equals("/home")) {
			dispatcherPath = "/WEB-INF/view/home/home.jsp";
			
		} else if (requestURI.equals("/login")) {

			System.out.println("requesturi in homecontrolelr : " + requestURI);
			dispatcherPath = "/dashboard.jsp";

		} else if (requestURI.equals("/logout")) {

		}

		if (dispatcherPath != null) {
			System.out.println("dispatcherPath : " + dispatcherPath);
			ServletContext servletContext = getServletContext();
			RequestDispatcher dispatcher = servletContext.getRequestDispatcher(dispatcherPath);
			dispatcher.forward(request, response);
		}
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
