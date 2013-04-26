package org.plab.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.plab.vo.UserVO;
import org.plab.vo.UserListVO;

public class InitSampleDataFilter implements Filter {

	private FilterConfig filterConfig;
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
	
		// create sample data
		UserListVO userList = UserListVO.getInstance();
		if(userList.getUserList().size() == 0) {
			UserVO sampleUser = new UserVO("keepdelight@test.com", "1234", "keepdelight");
			userList.getUserList().add(sampleUser);
		}
		
		filterChain.doFilter(request, response);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}
	
}
