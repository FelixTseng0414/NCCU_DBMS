package connection_sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testing {
	public static void dname(Statement st) {
		

		// Select city table
		ResultSet resultSet = st.executeQuery("SELECT * FROM DEPARTMENT   limit 10")
				
		while (resultSet.next()) {
		  System.out.println(resultSet.getString("Dname"));
		 }
		}
		
	
	
}



	
	

