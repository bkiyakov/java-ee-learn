# java-ee-learn

# Learning some Java EE Api

# 7 steps to use JDBC

# 1) import the package
--

import java.sql.*;

# 2) a. Load JDBC driver
     add jar file or add dependency to maven pom.xml
#    b. Register JDBC driver
     --
     
     Class.forName("org.postgresql.Driver");

# 3) Establish the connection to the DB
--

String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

# 4) Create the statement (for select)
--

Statement st = con.createStatement();

or prepared statement (for update)
--

PreparedStatement pst = con.prepareStatement(query);

# 5) Execute the Query
--

String query = "SELECT * FROM users";

ResultSet rs = st.executeQuery(query);

--

For update

String query = "INSERT INTO users (username) VALUES (?);";

PreparedStatement pst = con.prepareStatement(query);

pst.setString(1, username);

pst.executeUpdate();

# 6) Fetch result
--

rs.next();

String username = rs.getString("username");

# 7) Close connection and statement
--

st.close();

con.close();

# Example code
--

import java.sql.*; //Step 1

public class App {

    public static void main(String[] args) throws Exception {
    
    
        String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
	
		String dbUsername = "postgres";
		
		String dbPassword = "postgres";


        Class.forName("org.postgresql.Driver"); //Step 2. Don't forget to load JDBC driver first


        Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword); //Step 3
	
	
        Statement st = con.createStatement(); //Step 4


        String query = "SELECT * FROM users";
	
        ResultSet rs = st.executeQuery(query); //Step 5


        rs.next(); //Need to move pointer to the first row
	
	
        String username = rs.getString("username"); //Step 6


        st.close(); //Step 7
	
        con.close();


        //Now try insert rows
	
	
        con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword); //Step 3

        String query = "INSERT INTO users (username) VALUES (?);";
	
	
        PreparedStatement pst = con.prepareStatement(query); //Step 4

        username = "newuser";
	
	pst.setString(1, username);
	
	
	pst.executeUpdate(); //Step 5


        pst.close(); //Step 7
	
	con.close();
    }
}

#Tips

Use try - catch block to fetch SQL exceptions when trying to connect to the db and execute queries
