package org.plab.service;

import java.util.List;

import org.plab.vo.UserVO;
import org.plab.vo.UserListVO;

public class UserManagerImpl implements UserManager {

	@Override
	public UserListVO getUserList() {
		return UserListVO.getInstance();
	}

	@Override
	public UserListVO addUser(UserVO user) {
		UserListVO userListVO = UserListVO.getInstance();
		userListVO.getUserList().add(user);
		
		return userListVO;
	}

	@Override
	public UserVO getUserByEmail(String email) {
		List<UserVO> userList = UserListVO.getInstance().getUserList();
		UserVO targetUser = null;
		for(UserVO user : userList) {
			if(user.getEmail().equals(email)) {
				targetUser = user;
			}
		}
		return targetUser;
	}

}
