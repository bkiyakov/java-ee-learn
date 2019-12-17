package com.bknow.test_hibernate.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	private long id;
	
	@NaturalId
	private String username;
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL, orphanRemoval=true)
	private List<TodoItem> todos;
	
	public User() {
		
	}
	
	public User(String username) {
		this.username = username;
		this.todos = new ArrayList<TodoItem>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<TodoItem> getTodos() {
		return todos;
	}

	public void setTodos(List<TodoItem> todos) {
		this.todos = todos;
	}

	public long getId() {
		return id;
	}
	
	public void addTodo(TodoItem todo) {
		todo.setUser(this);
		this.todos.add(todo);
	}
	
	public void removeTodo(TodoItem todo) {
		this.todos.remove(todo);
	}
	
	@Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", username: " + username + "}";
    }
}	
