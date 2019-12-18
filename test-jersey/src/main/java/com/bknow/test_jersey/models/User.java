package com.bknow.test_jersey.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private long id;
	private String username;
	
	public User() {
		
	}
	
	public User(long id, String username) {
		this.id = id;
		this.username = username;
	}
	
	@Override
	public String toString() {
        return "{" +
                "id: " + id +
                ", username: " + username + "}";
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
