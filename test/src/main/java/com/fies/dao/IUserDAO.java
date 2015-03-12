package com.fies.dao;

import java.util.List;

import com.fies.model.User;

public interface IUserDAO {

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
