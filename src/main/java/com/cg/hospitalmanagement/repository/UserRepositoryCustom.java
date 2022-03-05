package com.cg.hospitalmanagement.repository;

import com.cg.hospitalmanagement.model.User;

public interface UserRepositoryCustom{
	 User findUser(String username, String password);

}
