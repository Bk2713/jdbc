package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testjdbc {

	public static void main(String[] args) throws Exception{
		//try 
		{
			String url="jdbc:mysql://localhost:3306/test";
			String user="root";
			String pass="1234";
			
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
		Class.forName("com.mysql.cj.jdbc.Driver");	
		
		Connection conn=DriverManager.getConnection(url, user, pass);
		
		Statement st=conn.createStatement();
		
		String query="select * from test.testtable";
		
		ResultSet rs=st.executeQuery(query);
	    
		System.out.println("detail" + rs);
		st.close();
		conn.close();
	
		}
		
		}

}