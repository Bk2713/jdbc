package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbcdemo { 

public static void main(String[] args) throws Exception {
	 //(Scanner sc = new Scanner(System.in)) {
		//String name=sc.nextLine();
	//	int uid=sc.nextInt();
		
		String url="jdbc:mysql://localhost:3306";
		String user="root";
		String pass="1234";
		
		String query="select * batch9.details'";
		//String query="DELETE FROM 'b09'.'details' VALUES " + ("+uid+" + "+name+");
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println(name);g
		//System.out.println(uid);
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection con=DriverManager.getConnection(url,user,pass);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		System.out.println(rs);
		
		st.close();
		con.close();
	}
	}

//}
