package models;

public class User {
	private int id;
	private String username;
	
	public int getId() {
		return this.id;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public User() {
		
	}
	
	public User(int id) {
		this.id = id;
	}
	
	public User(String username) {
		this.username = username;
	}
}
