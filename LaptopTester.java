package com.xworkz.laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class LaptopTester {
  
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/laptopdb";
		
		String userName = "root";
		
		String password = "Shakir@95";
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, userName ,password);
			
			System.out.println("Connection is successfull" + url);
			
		} catch (SQLException sqlException) {
			
		 System.out.println(sqlException.getMessage());
		 
		}catch (ClassNotFoundException classNotFoundException) {	
			
		 System.out.println(classNotFoundException.getMessage());
		 
			classNotFoundException.printStackTrace();
			
		}
	}
}
