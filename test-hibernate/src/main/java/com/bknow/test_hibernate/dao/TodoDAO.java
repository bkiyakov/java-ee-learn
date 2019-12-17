package com.bknow.test_hibernate.dao;

import com.bknow.test_hibernate.models.TodoItem;

public interface TodoDAO {
	public TodoItem findTodoById(long id);
}
