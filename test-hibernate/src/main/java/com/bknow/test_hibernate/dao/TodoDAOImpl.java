package com.bknow.test_hibernate.dao;

import com.bknow.test_hibernate.models.TodoItem;
import com.bknow.test_hibernate.utils.HibernateSessionFactoryUtil;

public class TodoDAOImpl implements TodoDAO{
	public TodoItem findTodoById(long id) {
		return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(TodoItem.class, id);
	}
}
