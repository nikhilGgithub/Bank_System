package bank.management.system;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

import java.sql.*;

public class Coon {
Connection connection;

Statement statement;

	public Coon() {
		try {
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","T#9758@qlph");
			statement=connection.createStatement();
			
		}catch(Exception e) {
			
		}
	}
}
