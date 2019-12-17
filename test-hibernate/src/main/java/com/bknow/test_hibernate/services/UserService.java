package com.bknow.test_hibernate.services;

import java.util.List;

import com.bknow.test_hibernate.dao.UsrDAOImpl;
import com.bknow.test_hibernate.models.User;

public class UserService {
	private UsrDAOImpl userDao = new UsrDAOImpl();
	
	public UserService() {
		
	}
	
	public User findUserById(long id) {
		return userDao.findUserById(id);
	}

	public boolean saveUser(User user) {
		userDao.saveUser(user);
		
		return true;
	}

	public boolean updateUser(User user) {
		userDao.updateUser(user);
		
		return true;
	}

	public boolean deleteUser(User user) {
		userDao.deleteUser(user);
		
		return true;
	}
	
	public List<User> findAll(){
		List<User> users = userDao.findAll();
		
        return users;
	}
}
