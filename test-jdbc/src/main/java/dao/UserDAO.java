package dao;

import models.User;

public interface UserDAO {
	
	public User getUsernameById(int id);
	
	public void addUser(String username);
	
	//TODO getIdByUsername
	//TODO getAllUsers
}
