package com.bknow.test_hibernate.models;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="todos")
public class TodoItem {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="label")
	private String label;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	public TodoItem() {
		
	}
	
	public TodoItem(String lable) {
		this.label = lable;
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getId() {
		return id;
	}
	
	@Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", label: " + label + "}";
    }
}
