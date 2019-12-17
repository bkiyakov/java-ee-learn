package com.bknow.test_hibernate.dao;

import java.util.List;

import com.bknow.test_hibernate.models.User;

public interface UserDAO {
	public User findUserById(long id);
	public boolean saveUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public List<User> findAll();
}
