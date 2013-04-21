package org.plab.service;

import org.plab.vo.User;
import org.plab.vo.UserListVO;

public interface UserManager {
	
	UserListVO getUserList();
	
	UserListVO addUser(User user);
	
	User getUserByEmail(String email);
	
}
