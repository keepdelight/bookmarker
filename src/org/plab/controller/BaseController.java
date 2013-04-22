package org.plab.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.plab.vo.UserVO;

public class BaseController extends HttpServlet {
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
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
	
	public UserVO getCurrentUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return (UserVO)session.getAttribute("currentUser");
	}
	
	public void removeCurrentUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("currentUser");
	}
}
