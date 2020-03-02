package com.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.entity.User;

public class DBConnection {

private static final String url = "jdbc:mysql://localhost:3306/bank";
	
	private static final String driver = "com.mysql.jdbc.Driver";
	
	private static final String username = "root";
	
	private static final String password = "";
	
	
	public static Connection openConnection() {
		
		Connection connection = null; 
		
		try {
			
			Class.forName(driver);
			 
			connection = DriverManager.getConnection(url, username, password);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return connection;
	}
	public static int add(User user) {

		int flag=0;
		try {
            String sql = "INSERT INTO userdetails (username,email,age,phone,branch,accnumber)VALUES (?,?,?,?,?,?);";
            Connection connection = DBConnection.openConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getUserEmail());
            ps.setString(3, user.getUserAge());
            ps.setString(4, user.getUserPhone());
            ps.setString(5, user.getUserBranch());
            ps.setString(6, user.getUserAccount());
            flag = ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return flag;
		
	}
	public static User getUserID(int id){
		User user = new User();
		try{
			String sql = "SELECT max(id) FROM userdetails"; 
			try (Connection connection = DBConnection.openConnection()){
				PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    user.setId(rs.getInt(1));
			}
                connection.close();
	}
		}catch (SQLException ex) {
            System.out.println(ex);
        }
		return user;
}
}