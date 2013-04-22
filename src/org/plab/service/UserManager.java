package org.plab.service;

import org.plab.vo.UserVO;
import org.plab.vo.UserListVO;

public interface UserManager {
	
	UserListVO getUserList();
	
	UserListVO addUser(UserVO user);
	
	UserVO getUserByEmail(String email);
	
}
