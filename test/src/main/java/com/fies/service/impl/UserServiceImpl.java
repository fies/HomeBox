package com.fies.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fies.dao.IUserDAO;
import com.fies.model.User;
import com.fies.service.IUserService;

 @Service("UserService")
 @Transactional(readOnly = true)
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDAO userDAO;

	@Override
	@Transactional(readOnly = false)
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDAO.addUser(null);

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "UserServiceImpl [userDAO=" + userDAO + "]";
	}

}
