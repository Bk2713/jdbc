package com.jdbc;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Student.display();
	}

}
