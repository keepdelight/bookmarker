package org.plab.vo;

import java.util.ArrayList;
import java.util.List;

public class UserListVO {
	
	private static UserListVO userListVO = new UserListVO();
	
	private List<User> userList;
	
	private UserListVO() {
		userList = new ArrayList<User>();
	}
	
	public static UserListVO getInstance() {
		return userListVO;
	}
	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
