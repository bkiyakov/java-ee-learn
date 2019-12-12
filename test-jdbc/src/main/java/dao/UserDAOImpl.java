package dao;

import models.User;
import java.sql.*;

public class UserDAOImpl implements UserDAO{
	
	Connection con = null;
	
	private void connect() {

		String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
		String dbUsername = "postgres";
		String dbPassword = "postgres";
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		}
		catch (Exception e) {
			System.out.println("Exception connect(): " + e.getMessage());
		}
	}
	
	public User getUsernameById(int id) {

		User user = new User(id);
		String query = "SELECT * FROM users WHERE id = " + id;
		
		connect();
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			user.setUsername(rs.getString("username"));

			st.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println("Exception getUserById(): " + e.getMessage());
		}
		
		return user;
	}
	public void addUser(String username) {
		
		String query = "INSERT INTO users (username) VALUES (?);";
		
		connect();
		
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, username);
			pst.executeUpdate();
			
			pst.close();
			con.close();
		}
		catch (Exception e) {
			System.out.println("Exception addUser: " + e.getMessage());
		}
	}
	
	
}
