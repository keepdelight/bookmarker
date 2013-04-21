package org.plab.service;

import java.util.List;

import org.plab.vo.User;
import org.plab.vo.UserListVO;

public class UserManagerImpl implements UserManager {

	@Override
	public UserListVO getUserList() {
		return UserListVO.getInstance();
	}

	@Override
	public UserListVO addUser(User user) {
		UserListVO userListVO = UserListVO.getInstance();
		userListVO.getUserList().add(user);
		
		return userListVO;
	}

	@Override
	public User getUserByEmail(String email) {
		List<User> userList = UserListVO.getInstance().getUserList();
		User targetUser = null;
		for(User user : userList) {
			if(user.getEmail().equals(email)) {
				targetUser = user;
			}
		}
		return targetUser;
	}

}
