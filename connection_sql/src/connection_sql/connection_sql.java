package connection_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class connection_sql {
	// mysql
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/Nccu_Course_Practice?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	//userid&password
	static final String USER = "root";
	static final String PASS = "785kjigccghk";

	
	//// sql server
	// static final String ms_sql_conn_string = "jdbc:sqlserver://localhost;";
	// static final String ms_sql_db = "database=" + "yourDB;";
	// static final String ms_sql_user = "user=" + "your id;";
	// static final String ms_sql_pass = "password=" + "your password;";

	public static void main(String[] args) throws ClassNotFoundException {


		// replace xxxxxx with your ID
		System.out.println("My StuID is Felix");
		// run mysql
		connection_mysql();

		// run sqlserver
		//connection_sqlserver();
	}
	
	
	public static void connection_mysql() {
		try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   System.out.println("Driver loaded!");
			  } catch (ClassNotFoundException e) {
			   System.out.println("Can't find driver");
			   e.printStackTrace();
			  }
		
		try {
		    Connection conn =  DriverManager.getConnection(DB_URL, USER, PASS);
		    System.out.println("mysql Connection Success");
		    Statement st= conn.createStatement();

		    // 呼叫 printDname 方法
		    functionss.printDname(st);
		    
		    System.out.println("分隔線");
		    
		    List<String> departmentNames = functionss.getDepartmentNames(st);
		    for (String departmentName : departmentNames) {
			    System.out.println(departmentName);
			}
		    
		    System.out.println("分隔線");
		    System.out.println(departmentNames);
		    
		    
		} catch (SQLException e) {
		    e.printStackTrace();
		}		 
		
		
		
		
		

		
		
		 
	}



}
