package org.plab.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.plab.service.UserManager;
import org.plab.service.UserManagerImpl;
import org.plab.vo.UserVO;
// getcurrentuser는 basecontroller에서 처리!
public class HomeController extends BaseController {
	
	private UserManager userManager = new UserManagerImpl();
	
	@Override
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		String dispatcherPath = null;
		
		System.out.println("requestURI : " + requestURI);

		if (requestURI.equals("/home")) {
			if(getCurrentUser(request) != null) {
				response.sendRedirect("/bookmark/home");
				return;
			} else {
				dispatcherPath = "/WEB-INF/view/home/home.jsp";
			}
			
		} else if (requestURI.equals("/login")) {
			if(request.getMethod().equals("GET")) {
				response.sendRedirect("/home");
				return;
			} else {
				System.out.println("requesturi in homecontrolelr : " + requestURI);
				UserVO targetUser = userManager.getUserByEmail(request.getParameter("email"));
	 
				if(targetUser.getPassword().equals(request.getParameter("password"))) {
					// session에 저장하는 로직이 있어야 함
					HttpSession session = request.getSession();
					session.setAttribute("currentUser", targetUser);
	//				dispatcherPath = "/WEB-INF/view/bookmark/dashboard.jsp";
					response.sendRedirect("/bookmark/home");
					return;
				} else {
					System.out.println("not registered user or incorrect input");
				}
			}

		} else if (requestURI.equals("/logout")) {
			removeCurrentUser(request);
			response.sendRedirect("/home");
			return;
		}

		if (dispatcherPath != null) {
			System.out.println("dispatcherPath : " + dispatcherPath);
			ServletContext servletContext = getServletContext();
			RequestDispatcher dispatcher = servletContext.getRequestDispatcher(dispatcherPath);
			dispatcher.forward(request, response);
		}
	}

}
