package com.bknow.test_hibernate.services;

import com.bknow.test_hibernate.dao.TodoDAOImpl;
import com.bknow.test_hibernate.models.TodoItem;

public class TodoService {
	TodoDAOImpl todoDao = new TodoDAOImpl();
	
	public TodoService() {
		
	}
	
	public TodoItem findTodoById(long id) {
		return todoDao.findTodoById(id);
	}
}
