package org.plab.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.plab.service.UserManager;
import org.plab.service.UserManagerImpl;
import org.plab.vo.User;
import org.plab.vo.UserListVO;

public class UserController extends HttpServlet {

	private UserManager userManager = new UserManagerImpl();
	
	@SuppressWarnings("unchecked")
	protected void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String requestURI = request.getRequestURI();
		String dispatcherPath = null;
		
		System.out.println("requestURI : " + requestURI);
		

		if (requestURI.equals("/user/sign_up")) {
			if(request.getMethod().equals("GET")) {
				dispatcherPath = "/WEB-INF/view/user/sign-up.jsp";
			} else {
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				String name = request.getParameter("username");
				
				User paramUser = new User(email, password, name);
				UserListVO userListVO = userManager.addUser(paramUser); 
				
				System.out.println("added user : " + userListVO.getUserList().get(1).getEmail());
				JSONObject obj = new JSONObject();
				obj.put("returnCode", 100);
			}
			
		} else if (requestURI.equals("/user/update")) {

		}
		
		if(dispatcherPath != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(dispatcherPath);
			dispatcher.forward(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
