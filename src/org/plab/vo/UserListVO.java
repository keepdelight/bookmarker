package org.plab.vo;

import java.util.ArrayList;
import java.util.List;

public class UserListVO {
	
	private static UserListVO userListVO = new UserListVO();
	
	private List<UserVO> userList;
	
	private UserListVO() {
		userList = new ArrayList<UserVO>();
	}
	
	public static UserListVO getInstance() {
		return userListVO;
	}
	
	public List<UserVO> getUserList() {
		return userList;
	}

	public void setUserList(List<UserVO> userList) {
		this.userList = userList;
	}
}
