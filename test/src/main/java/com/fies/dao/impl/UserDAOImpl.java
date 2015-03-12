package com.fies.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.fies.dao.IUserDAO;
import com.fies.model.User;

@Repository
public class UserDAOImpl implements IUserDAO {

//	private SessionFactory sessionFactory;
//
//	public SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
//
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		// this.sessionFactory = sessionFactory;
//	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		// sessionFactory.getCurrentSession().save(user);
		System.out.println("User added to database");
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		// sessionFactory.getCurrentSession().update(user);
		System.out.println("User updated to database");
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		// sessionFactory.getCurrentSession().delete(user);
		System.out.println("User deleted to database");
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub

		//
		/*
		 * Criteria cr =
		 * sessionFactory.getCurrentSession().createCriteria(User.class);
		 * cr.add(Restrictions.eq("id", id)); User user2 = (User)
		 * cr.uniqueResult();
		 * 
		 * @SuppressWarnings("unchecked") List<User> userlist =
		 * sessionFactory.getCurrentSession
		 * ().createQuery("from User where id=?").setParameter(0, id).list();
		 * return userlist.get(0);
		 */
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		/*
		 * @SuppressWarnings("unchecked") List<User> userlist =
		 * sessionFactory.getCurrentSession().createQuery("from User").list();
		 * return userlist;
		 */

		return null;
	}

}
