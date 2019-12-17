package com.bknow.test_hibernate.dao;

import java.util.List;

import org.hibernate.*;

import com.bknow.test_hibernate.models.User;
import com.bknow.test_hibernate.utils.HibernateSessionFactoryUtil;

public class UsrDAOImpl implements UserDAO {

	public User findUserById(long id) {
		return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
	}

	public boolean saveUser(User user) {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.save(user);
		tr.commit();
		session.close();
		
		return true;
	}

	public boolean updateUser(User user) {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.update(user);
		tr.commit();
		session.close();
		
		return true;
	}

	public boolean deleteUser(User user) {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.delete(user);
		tr.commit();
		session.close();
		
		return true;
	}
	
	public List<User> findAll(){
		List<User> users = (List<User>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Users").list();
        return users;
	}
}
