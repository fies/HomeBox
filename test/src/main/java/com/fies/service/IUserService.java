package com.fies.service;

import java.util.List;

import com.fies.model.User;

public interface IUserService {
	
	public void addUser(User user);

	/**
	 * Update User
	 * 
	 * @param User
	 *            user
	 */
	public void updateUser(User user);

	/**
	 * Delete User
	 * 
	 * @param User
	 *            user
	 */
	public void deleteUser(User user);

	/**
	 * Get User
	 * 
	 * @param int User Id
	 */
	public User getUserById(int id);

	/**
	 * Get User List
	 * 
	 */
	public List<User> getUsers();

}
